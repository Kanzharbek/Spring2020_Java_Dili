package day42_Inheritance;

import day41_Inheritance.Animal;

public class Data {
    public static String publicData = "public"; // visible to the world
    protected static String protectedData = "protected"; // visible for sub classes
    static String defaultData = "default"; // not visible outside the package
    private String privateData = "private"; // not visible outside of class. not inheritable
}

