package OfficeHours.Practice_05_27_2020;

public class MethodOverriding2 {

    void method1() { // instance method

    }

    public static void method2() { // static custom method

    }

    public MethodOverriding2() { // contractor

    }
}

class TestClass extends MethodOverriding2 {

    @Override
    protected void method1() {

    }

    public static void method2() {

    }

    //public MethodOverriding2(){ } cannot inherit a constructor from sub class
}
