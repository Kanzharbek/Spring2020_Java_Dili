package day44_Exceptions;

public class practice2 {
    /*
    print: hello
            after 2 seconds...
    print: Cybertek
    wait 3 seconds
     */

    public static void waits(double seconds) {
        try {
            Thread.sleep((long)(seconds * 1000));
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        waits(2);
        System.out.println("Cybertek");
        waits(3);

    }
}
