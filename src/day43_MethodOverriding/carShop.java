package day43_MethodOverriding;

public class carShop {

    public static void main(String[] args) {

        Tesla tesla1 = new Tesla();
        tesla1.Start();

        System.out.println("==================================");

        Honda honda1 = new Honda();
        honda1.Start();

        System.out.println("==================================");

        Jeep jeep1 = new Jeep();
        jeep1.Start();

        System.out.println("==================================");

        BMW bmw1 = new BMW();
        bmw1.Start();
    }
}
