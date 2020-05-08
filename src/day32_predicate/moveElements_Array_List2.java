package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moveElements_Array_List2 {
    /*
    Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println(list);

        int count = Collections.frequency(list, 0); // frequency of 0s and assigning to count variable
        System.out.println(count);

        list.removeAll(Arrays.asList(0)); // removing all 0s from the list
        System.out.println(list);

        for (int i = 0; i < count; i++) { // add 0s count times to the list
            list.add(0);
        }
        System.out.println(list);

    }
}
