package day45_Exceptions;

public class throwsKeyword3 {

    public static void method1() throws Exception {
        Thread.sleep(3000);
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {}
    }
}
