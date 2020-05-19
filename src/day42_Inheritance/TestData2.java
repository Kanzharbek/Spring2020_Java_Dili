package day42_Inheritance;

public class TestData2 extends AccessModifiers {
    /*
    publicVar
    protectedVar
    defaultVar

    privateVar
     */
    public static void main(String[] args) {

        System.out.println(TestData2.publicVar);
        System.out.println(TestData2.protectedVar);
        System.out.println(TestData2.defaultVar);

        TestData2.publicMethod1();
        TestData2.protectedMethod();
        TestData2.defaultMethod();
        //TestData2.privateMethod();
    }
}
