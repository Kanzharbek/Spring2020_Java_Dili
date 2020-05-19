package Resources;

import day42_Inheritance.AccessModifiers;

public class Inheritance2 extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(Inheritance2.publicVar);
        System.out.println(Inheritance2.protectedVar);

        Inheritance2.publicMethod1();
        Inheritance2.protectedMethod();

    }


}
