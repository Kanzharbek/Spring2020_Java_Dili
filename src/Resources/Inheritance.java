package Resources;

import day42_Inheritance.Data;
    /*
    public static String publicData = "public"; // visible to the world
    protected static String protectedData = "protected"; // visible for sub classes
    static String defaultData = "default"; // not visible outside the package
    private String privateData = "private"; // not visible outside of class. not inheritable
     */

public class Inheritance extends Data {
    //          sub              super

    public static void main(String[] args) {

        System.out.println(Inheritance.protectedData); // protected  is always to any sub class
        System.out.println(Inheritance.publicData); // public is visible to the world
        // System.out.println(Inheritance.defaultData); not visible outside of package
        // System.out.println(Inheritance.privateData); private never can be inherited


    }
}
