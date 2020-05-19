package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        this(9); // constructor with int argument
        System.out.println("Default");
    }

    public ConstructorCalls3(int a){
        //this(); // cannot call because default constructor contains this int argument constructor.
        System.out.println("int argument");
    }

    public ConstructorCalls3(String str){
        this(0); // constructor with int argument
       // this("Alexa"); // constructor cannot call itself
    }

    public void method1(){
        method1();
    }

    public static void main(String[] args) {

        ConstructorCalls3 obj = new ConstructorCalls3();

        ConstructorCalls3 obj1 = new ConstructorCalls3(1);


    }



}
