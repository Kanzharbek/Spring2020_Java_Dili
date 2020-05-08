package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class movingElements_Array_List {
    /*
    Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println(list);

        int count = 0;
        for (Integer each : list) { // each: each element in ArrayList
            if (each == 0) { // finding frequencies of 0s
                count++; // counting frequency of 0
            }
        }
        System.out.println(count);
        System.out.println(list);

        list.removeAll(Arrays.asList(0)); // remove all 0s from an ArrayList
        System.out.println(list);

        for (int i = 0; i < count; i++) { // add 0s count times to the list
            list.add(0);
        }
        System.out.println(list);
    }
}
