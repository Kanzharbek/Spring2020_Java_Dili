package day42_Inheritance;

public class AccessModifiers {

    public static String publicVar = "public"; // visible to the world
    protected static String protectedVar = "protected"; // visible for sub classes
    static String defaultVar = "default"; // not visible outside the package
    private String privateVar = "private"; // not visible outside of class. not inheritable

    public static void publicMethod1() {
        System.out.println("Public method");
    }

    protected static void protectedMethod() {
        System.out.println("Protected method");
    }

    static void defaultMethod() {
        System.out.println("Default method");
    }

    private static void privateMethod() {
        System.out.println("private method");
    }
}


