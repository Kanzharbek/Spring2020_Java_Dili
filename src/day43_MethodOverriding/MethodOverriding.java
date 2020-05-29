package day43_MethodOverriding;

class Test {

    public void method() {
        System.out.println("Onur");
    }


}

public class MethodOverriding extends Test {

    @Override // we can use to identify if this method is overridden
    public void method() { // Override method from super class.
        System.out.println("Zarina");

    }

    public static void main(String[] args) {

        Test obj1 = new Test(); // Super class' object
        obj1.method(); // Onur --> method from super class

        MethodOverriding obj2 = new MethodOverriding(); // sub class object
        obj2.method(); // Zarina


    }

}

