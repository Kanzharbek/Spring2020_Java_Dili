package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try{
            System.out.println(str.charAt(400));
        }catch (RuntimeException e){
            String description = e.getMessage();
            System.out.println(description);
        }

        System.out.println("================================");

        String result = "";

        try {
            System.out.println(100/0);
            System.out.println("Try block");
        }catch (ArithmeticException e){
            System.out.println("Catch block");
            result = e.getMessage();
        }

        System.out.println(result);

        System.out.println("Completed");


    }
}
