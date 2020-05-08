package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class maxNum_Array_List {
    /*
           write a program that can return the second maximum number from Arraylist
                   Ex: {1,2,3,4,5,6,7,8,8};
                           output: 7
        */
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 4));
        // second max: 3

        Integer maxNum = Collections.max(numbers);  //4

        numbers.removeAll(Arrays.asList(maxNum));

        System.out.println(numbers);


        int secondMax = Collections.max(numbers);

        System.out.println(secondMax);


    }
}
