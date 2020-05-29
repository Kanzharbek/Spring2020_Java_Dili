package OfficeHours.Practice_05_20_2020;

class TestData {
    int num = 100;
    String name = "Cybertek";

    public void method() {
        System.out.println("Cybertek School");
    }
}

public class SuperKeyword2 extends TestData {

    int num = 200;
    String name = "MIT";

    public void method() {
        System.out.println("MIT School");
    }

    public SuperKeyword2() {
        method(); // local method
        System.out.println(this.num); // local instance var
        System.out.println(this.name); // local instance var

        super.method(); // method from super class
        System.out.println(super.name); // instance var from super class
        System.out.println(super.num); // instance var from super class
    }

    public static void main(String[] args) {
        SuperKeyword2 obj = new SuperKeyword2();

    }
}
