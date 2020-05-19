package day37_Constructor;

import java.util.Arrays; // imports only Arrays class from java.util package
import java.util.*; // importing all classes from java.util package
import static day37_Constructor.Data.staticVar;
import static day37_Constructor.Data.staticMethod;


public class importStatement {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};
        Arrays.sort(arr);

        System.out.println(staticVar);
        staticMethod();

    }
}
