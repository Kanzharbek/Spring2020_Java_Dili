package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class combine2ArrayList {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10, 11, 12, 13};

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int each : arr1) { // each element of arr1
            list2.add(each);
        }

        for (int each : arr2) { // each element of arr2
            list2.add(each);
        }

        System.out.println(list2);
    }
}
