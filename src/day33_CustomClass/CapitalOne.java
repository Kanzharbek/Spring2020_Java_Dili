package day33_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {
        bankAccount Dilnaz = new bankAccount();
        Dilnaz.accountHolder = "Dilnaz";
        Dilnaz.accountNumber = 123456789;

        Dilnaz.checkingBalance();
        Dilnaz.deposit(2500);
        Dilnaz.withDraw(1450);
        Dilnaz.checkingBalance();





    }
}
