package day42_Inheritance;

class Test { // parent class

    public Test() { // default constructor
        this(2); // calling int constructor
        System.out.println("Parent class' default constructor");
    }

    public Test(int a) {
        System.out.println("Parent class' constructor with int");
    }
}

public class Constructor2 extends Test {
    //          sub               super

    public Constructor2() { // default constructor
        super(); // calling a default constructor of super class(parent)
        System.out.println("Child class default constructor");
    }

    public Constructor2(int a){// int constructor
    super(7); // calling int constructor from super class
        System.out.println("child class int constructor");
    }

    public static void main(String[] args) {

        Constructor2 obj = new Constructor2(); //

        Test obj1 = new Test(1);


    }
}
