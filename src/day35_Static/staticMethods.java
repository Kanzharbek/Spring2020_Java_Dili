package day35_Static;

public class staticMethods {

    int a = 100;

    static int b = 200;

    public static void main(String[] args) {
        /*
        System.out.println(a); ==> we cannot call instance var in static method without object
        static only accepts static
         */

        staticMethods obj1 = new staticMethods();
        System.out.println(obj1.a); // we can call instance var through object

        System.out.println("----------------------------------------------------------------------");

        System.out.println(b); // calling static var in static method
        System.out.println(staticMethods.b); // calling with static method
        System.out.println(obj1.b); // not preferred to call through object name
    }

    public void method() { // instance method
        System.out.println(a); // can call instance var in instance method
        System.out.println(b); // instance method accepts static var directly
    }
}
