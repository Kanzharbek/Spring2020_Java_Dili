package day46_final_abstraction;

public class final_variables {

    // instance variables:
    final int instanceVar = 300;
    // final int instanceVar2; MUST to initialize it immediately if "final" is specified

    //static variables:
    final static int staticVar = 1000;
    // final static int staticVar2; need to be initialized immediately if "final" is specified


    public static void main(String[] args) {

        // local variables:
        double PI = 3.14;
        PI = 3.15; // we can reassign any variable

        final String gender = "Male";
        // gender = "Female"; if "final" keyword was specified the value of var cannot be reassigned

        final int score; // local var can be initialized later
        score = 100; // here we assigned 100 to score, and cannot be changed after
        //score = 200; // here we cannot reassign it because "final" keyword was specified at the beginning
        System.out.println(score);

        final_variables obj = new final_variables();
        // obj.instanceVar = 400; cannot change
        // this.staticVar = 2000; cannot change

    }

}
