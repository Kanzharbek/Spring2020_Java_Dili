package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class bulk_removeDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8));

        ArrayList<Integer> result = new ArrayList<>(); // expected result: [1, 2, 3, 4, 5, 6, 7, 8]

        for (Integer each : list) { // each: 1, 1, 2, 2, 3, 3...
            if (!result.contains(each)) {
                result.add(each);
            }
        }
        System.out.println(result);
        System.out.println("========================================================");
        /*
            write a program that removes duplicates from an Array of integer
         */
        int[] arr1 = {1, 1, 2, 2, 3, 3};
        ArrayList<Integer> nonDup = new ArrayList<>();

        for (int i = 0; i < arr1.length-1; i++){
            if(!nonDup.contains(arr1[i])){
                nonDup.add(arr1[i]);
            }
        }
        System.out.println(nonDup);


    }
}
