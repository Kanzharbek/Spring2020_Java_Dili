package day40_Encapsulation;

public class Quiz_q12 {

    public static String name = "Osman";

    public Quiz_q12 (){ // executes only when object created
        name = "Hilal";
    }

    { // instance block runs before constructor
        name = "Marionela";
    }

    static { // runs first
        name = "Madina";
    }

    public static void main(String[] args) {
        System.out.println(name); // Madina

        Quiz_q12 obj = new Quiz_q12();
        System.out.println(obj.name); // Hilal

    }

}
