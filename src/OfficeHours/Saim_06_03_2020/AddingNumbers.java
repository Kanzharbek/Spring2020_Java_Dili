package OfficeHours.Saim_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class AddingNumbers {
    /*
    1) Create a method that will accept an int array
     and return the sum of all the numbers in the given array
    2) Overload the method to accept an ArrayList of integers
    and return the sum of all the numbers in the given ArrayList
     */

    public static int sumElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sumElements(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 6, 1, 9};
        int sumAr = sumElements(arr);
        System.out.println(sumAr); // 3-

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        int sumList = sumElements(list);
        System.out.println(sumList); // 30
    }
}
