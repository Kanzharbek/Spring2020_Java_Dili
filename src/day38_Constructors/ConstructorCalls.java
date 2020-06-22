package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls() {
        method1(); // Constructor can call static method directly
        method2();
    }

    public ConstructorCalls(int a) {
        // ConstructorCalls(); cannot call constructor by it's name
        this(); // calling constrictor with "this" keyword
    }

    public static void method1() { // custom method
        method2();
        // ConstructorCalls(); // only Constructor can call another Constructor
    }

    public static void method2() {
        method1();
    } // method calling a regular method
}
