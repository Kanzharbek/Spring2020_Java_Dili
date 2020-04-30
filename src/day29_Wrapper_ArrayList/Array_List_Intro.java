package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class Array_List_Intro {

    public static void main(String[] args) {
        //ArrayList<DataType> name = new ArrayList<DataType>();
        //          mandatory                       optional

        ArrayList<Integer> scores = new ArrayList<Integer>(); // size 0
        //                          add five elements: size: 5
        //                          remove one element: size 4

        scores.add(10); // autoboxing    size: 1
        System.out.println(scores);
        scores.add(20); // autoboxing    size: 2
        System.out.println(scores);
        scores.add(30); // autoboxing    size: 3
        System.out.println(scores);

        Integer a1 = scores.get(2); // none
        int a2 = scores.get(2); // unboxing
        double a3 = scores.get(2); // unboxing
        System.out.println(a2);

        // System.out.println(scores.get(100)); // index out of bound


    }
}
