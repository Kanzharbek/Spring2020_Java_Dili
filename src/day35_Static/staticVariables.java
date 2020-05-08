package day35_Static;

public class staticVariables {

    int a2 = 200; // instance var

    static int a3 = 300; // static var

    public static void main(String[] args) {

        int a1 = 100; // local var

        staticVariables obj1 = new staticVariables(); // new object
        obj1.a2 = 100; // a2: instance var

        obj1.a3 = 4000; // a3 is static

        staticVariables obj2 = new staticVariables();
        obj2.a2 = 200;

        obj2.a3 = 5000; // reassigning a3 because it's static

        System.out.println(obj1.a2); // 100
        System.out.println(obj2.a2); // 200

        System.out.println(obj1.a3); // 5000 static var a3
        System.out.println(obj2.a3); // 5000 static var a3


    }
}
