package OfficeHours.Practice_05_13_2020;

public class staticBlock {
    static String str;

    static {
        str = "Cybertek";
        str = "Harvard";
        str = "MIT";
    }

    public static void main(String[] args) {
        str = "Harvard";
        System.out.println(str); // Harvard
    }

}

class staticBlockTest {
    public static void main(String[] args) {
        System.out.println(staticBlock.str); // MIT
    }

}
