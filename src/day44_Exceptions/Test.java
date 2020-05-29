package day44_Exceptions;

public class Test {

    public static void main(String[] args) {
        Chrome obj1 = new Chrome();
        obj1.openBrowser();
        obj1.closeBrowser();

        Firefox obj2 = new Firefox();
        obj2.openBrowser();
        obj2.closeBrowser();

        Opera obj3 = new Opera();
        obj3.openBrowser();
        obj3.closeBrowser();

        Safari obj4 = new Safari();
        obj4.openBrowser(); // didn't override the method, so it will print inherited method as it is
        obj4.closeBrowser();
    }
}
