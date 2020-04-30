package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class List_methods {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println(list1);

        boolean b1 = list1.contains("Z"); // false
        System.out.println(b1);

        if (list1.contains("A")) { // true
            System.out.println("A is there");
        }

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");

        boolean b2 = list1.equals(list2);
        System.out.println(b2);

        Collections.sort(list1); // sorted in ascending order
        Collections.sort(list2); // sorted in ascending order

        boolean b3 = list1.equals(list2); // true after sorting them in ascending order
        System.out.println(b3);

        System.out.println("=========================================");

        // Arrays.sort();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};

        boolean bool1 = Arrays.equals(arr1, arr2); //false
        System.out.println(bool1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean bool2 = Arrays.equals(arr1, arr2); // true, because they are sorted in ascending order
        System.out.println(bool2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);
        System.out.println(list3);

        boolean b4 = list3.isEmpty(); // false
        System.out.println(b4);

        list3.clear();
        boolean b5 = list3.isEmpty(); // true, because we cleared the ArrayList. It is empty now
        System.out.println(b5);


    }
}
