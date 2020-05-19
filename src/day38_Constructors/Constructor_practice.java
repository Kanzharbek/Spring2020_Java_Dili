package day38_Constructors;

public class Constructor_practice {

    public Constructor_practice() {
        this(10.0); // C
        System.out.println("A");
    }

    public Constructor_practice(int a) {
        this();// C A
        System.out.println("B");
    }

    public Constructor_practice(double a) {
        //this(); // rule #5
        //this(5.5); // rule #5
        //this(10); //rule #5
        System.out.println("C");
    }

    public static void main(String[] args) {
        new Constructor_practice(10); // C A B
    }


}
