package day40_Encapsulation;

public class Quiz {

    public Quiz(){
        System.out.print("A ");
    }

    public Quiz(int a){
        this(2.5); // A C
        System.out.print("B ");
    }

    public Quiz(double a){
        this(); // A
        System.out.print("C ");
    }

    public static void main(String[] args) {
        Quiz obj = new Quiz(10); // A C B

    }
}
