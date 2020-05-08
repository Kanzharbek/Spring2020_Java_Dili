package day36_StaticBlock;

public class StaticBlock {

    static { // static block executes first, before main method, no matter where it's located
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        System.out.println("Hello Cybertek");
    }

    static {
        System.out.println("Hello batch18");
    }

    public static void method1(){ // this custom method will not execute itself. need to call in main method
        System.out.println("Custom method executed");
    }
}
