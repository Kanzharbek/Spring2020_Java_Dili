package day30_array_List;

import java.util.ArrayList;

public class combineTwoArraysToList {
    /*
            write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        for (String each : arr2) {
            list.add(each);
        }
        System.out.println(list);


    }
}
