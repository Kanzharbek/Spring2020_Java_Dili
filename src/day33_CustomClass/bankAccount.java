package day33_CustomClass;

public class bankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public void setInfo(String accHolder, int accNum, int accBalance){
        accountHolder = accHolder;
        accountNumber = accNum;
        balance = accBalance;
    }

    public void checkingBalance(){
        System.out.println("Available balance: $" + balance);
    }

    public void withDraw(double amount){
        System.out.println( "Withdrawing: $" + amount);
        balance -= amount;
    }

    public void deposit(double amount){
        System.out.println("Depositing: $" + amount);
        balance += amount;
    }

    public String toString(){
        String info = accountHolder + " " + accountNumber;
        return info;
    }

}
