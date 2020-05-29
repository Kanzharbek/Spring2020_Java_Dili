package day44_Exceptions;

public class practice {
    /*
    print: hello
            after 2 seconds...
    print: Cybertek
    wait 3 seconds
     */
    public static void main(String[] args) {

        System.out.println("Hello");
        try {
            Thread.sleep(2000); // accepts only long number
        }catch (Exception e){

        }
        System.out.println("Cybertek");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println("Java");
        try {
            Thread.sleep(4000);
        }catch (Exception e){

        }
        System.out.println("Completed");
    }

}
