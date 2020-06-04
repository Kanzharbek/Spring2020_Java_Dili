package OfficeHours.Saim_06_03_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseElements {
    /*
    3) Create a method that will accept an int array and
     reverse the order of elements. Return the reversed array.
    */
    public static int[] reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;

    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list){

        for(int i = 0; i < list.size()/2; i++){
            int temp = list.get(i);

        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
