package OfficeHours.Practice_05_20_2020;

class test {

    public test() {
        System.out.println("default");
    }

    public test(String str) {
        System.out.println("String");
    }

    public test(int a) {
        System.out.println("int");
    }
}

public class Constructor2 extends test {

    public Constructor2(){
        super("Hi"); // calling String constructor from test(super) class
        System.out.println("Sub default");
    }

    public static void main(String[] args) {
        Constructor2 obj = new Constructor2();

    }
}

