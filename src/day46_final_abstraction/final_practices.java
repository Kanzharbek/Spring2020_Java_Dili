package day46_final_abstraction;

public class final_practices {

    final int a = 10;
    final static int b = 20;

    { // instance block --> accepts only instance vars
        System.out.println(a);
        // a = 20; final instance var,  cannot be reassigned
        System.out.println(b);
        // b = 30; final static var, cannot be changed
    }

    public final_practices() { // constructor

    }

    public void method1() {

    }

    public void method2() {

    }

    private final int method1(int a) { // overloaded regular instance method to final method
        return 12;
    }

    public final static void method2(int a) { // overloaded regular instance method to final method

    }

}

final class test extends final_practices {

    /*
    @Override
    protected void method1(){ }
     */

}
