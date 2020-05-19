package day42_Inheritance;

public class TestData extends Data {
    /*
    public static String publicData = "public"; // visible to the world
    protected static String protectedData = "protected"; // visible for sub classes
    static String defaultData = "default"; // not visible outside the package
    private String privateData = "private"; // not visible outside of class. not inheritable
     */
    public static void main(String[] args) {
        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
        //System.out.println(TestData.privateData);
    }
}
