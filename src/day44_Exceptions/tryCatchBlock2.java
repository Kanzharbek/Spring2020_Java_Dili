package day44_Exceptions;

public class tryCatchBlock2 {

    public static void main(String[] args) {

        System.out.println("Hello");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);
        }

        System.out.println("==============================================");

        String result = "";

        try {
            System.out.println(10 / 0);
            System.out.println("Try block");
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
            result = e.getMessage();

        }
        System.out.println(result);

        System.out.println("World");


    }
}
