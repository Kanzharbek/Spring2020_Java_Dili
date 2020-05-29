package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class TryCatchBlock {

    public static void main(String[] args) {
        System.out.println("Test started"); // this line will execute before unchecked exception

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //System.out.println(list.get(10)); // unchecked exception will occur

        try {
            System.out.println(list.get(10)); // Index out of bound
        } catch (IndexOutOfBoundsException e) { // exception class(or parent class) & var name(any)
            System.out.println("Something went wrong");
        }

        System.out.println("Completed");
    }
}
