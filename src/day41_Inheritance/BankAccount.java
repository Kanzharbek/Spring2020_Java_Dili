package day41_Inheritance;

public class BankAccount {
    /*
    create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
     */
    public static String bankName = "Bank of America";  // public and static var,
    public String firstName; // public instance var
    public String lastName; // public instance var

    private String accountHolder; // private instance var
    private long accountNumber; // private instance var
    private double balance; // private instance var

    public BankAccount(String firstName, String lastName) { // constructor with 2 arg
        this.firstName = firstName;
        this.lastName = lastName;
        accountHolder = firstName + " " + lastName;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String firstName, String lastName) {
        accountHolder = firstName + lastName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposit) {
        // balance = balance + deposit;
        setBalance(balance + deposit); // here we are calling setBalance method and adding deposit
    }

    public void withdrawing(double withdrawing) {
        setBalance(balance - withdrawing);
    }

    public void checkBalance() {
        // System.out.println("Available balance: $" + balance); --> one way
        System.out.println("Available balance: $" + getBalance()); // --> second way
    }

    public String toString() {
        return "Full name: " + accountHolder + ", Available balance: $" + getBalance();
    }
}

class BankOfAmerica {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Dilnaz", "Sherali");

        System.out.println(acc1.getAccountHolder()); // Dilnaz Sherali
        System.out.println(acc1.getBalance());

        acc1.setAccountNumber(11223344); // setter: setting account number
        System.out.println(acc1.getAccountNumber()); // 11223344

        acc1.checkBalance(); // balance = 0

        acc1.deposit(100); // deposit 100
        acc1.checkBalance(); // balance = 100

        acc1.withdrawing(25); // withdrawing 25
        acc1.checkBalance(); // balance= 75

        System.out.println(acc1.getBalance()); // 75

        System.out.println(acc1);

    }
}
