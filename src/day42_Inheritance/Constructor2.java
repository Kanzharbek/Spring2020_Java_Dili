package day42_Inheritance;

class Test { // parent class

    public Test() { // constructor
        this(2);
        System.out.println("Parent class' default constructor");
    }

    public Test(int a) {
        System.out.println("Parent class' constructor with int");
    }
}

public class Constructor2 extends Test {
    //          sub               super

    public Constructor2() { // constructor
        super(); // calling a constructor of super class(parent)
        System.out.println("Child class default constructor");
    }

    public Constructor2(int a){
    super(7);
        System.out.println("child class int constructor");
    }

    public static void main(String[] args) {

        Constructor2 obj = new Constructor2(); //

        Test obj1 = new Test(1);


    }
}
