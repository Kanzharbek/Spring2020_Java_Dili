package day52_Collections;

import java.util.*;

public class Collections_Utility {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(6, 6, 6, 4, 4, 4, 1, 1, 1, 7, 8, 5, 5, 3, 3, 2, 9));
        nums = new ArrayList<>(new TreeSet<>(nums)); // removes duplicates and sorts in ascending order
        System.out.println(nums);

        System.out.println("-------------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,6,6,5,5,5,4,4,4));
        list = new ArrayList<>(new LinkedHashSet<>(list)); // removes duplicates
        System.out.println(list);

        System.out.println("---------------------------------------------------------------------");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("A", "C", "D", "B", "A"));
        boolean result = Collections.frequency(letters, "A")==1;

        System.out.println(result);



    }
}
