package OfficeHours.Practice_05_27_2020;

public class MethodOverriding {

    protected void method1(){
        System.out.println("Super class");
    }

}

class Test extends MethodOverriding{

    @Override
    public void method1(){ // overriding method from super class
        System.out.println("Sub class");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.method1(); // calling overridden method with an object
    }

}
