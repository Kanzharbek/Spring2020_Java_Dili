package day35_Static;

public class staticVariables2 {

    int instVar;

    static int staticVar;

    public static void main(String[] args) {
        staticVariables2 ob1 = new staticVariables2();
        ob1.instVar = 7;
        ob1.staticVar = 7;

        staticVariables2 ob2 = new staticVariables2();
        ob2.instVar = 1;
        ob2.staticVar = 1; // reassigning staticVar

        System.out.println(ob1.instVar); // 7
        System.out.println(ob2.instVar); // 1

        System.out.println(ob2.staticVar); // 1
        System.out.println(ob1.staticVar); // 1 , staticVar is reassigned from 7 to 1

        System.out.println("Static var: "+staticVariables2.staticVar); // calling static var through class name

    }
}
