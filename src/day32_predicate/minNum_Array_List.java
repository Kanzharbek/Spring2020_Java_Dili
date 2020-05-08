package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class minNum_Array_List {
    /*
        write a program that can return the second minimum number from Arraylist
        Ex: {1,1,2,3,4,5,6,7,8,8};
        output: 2
     */
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8));
        Integer minNum = Collections.min(list2); //1

        list2.removeAll(Arrays.asList(minNum));  // removes all the minimum number
        System.out.println(list2);

        int secondMin = Collections.min(list2);
        System.out.println(secondMin);


    }
}
