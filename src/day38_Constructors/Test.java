package day38_Constructors;

public class Test {

    public Test() { // constructor runs ONLY with an object. If there is no object it will not execute
        System.out.println("Constructor");
    }

    static { // static block runs first whenever class is loaded
        System.out.println("Static block");
    }

    { // instance block runs ONLY with an object.
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        System.out.println("Main method"); // print statement executes before objects below: instance and constructor will run after
        new Test();
        new Test();
    }

}
