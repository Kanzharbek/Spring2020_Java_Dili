package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class maxMin {

    public static void main(String[] args) {
        String[] arr = {"1", "2.5", "3", "3.5", "4.5"};
        double max = Double.MIN_VALUE;

        for (String each : arr) {

            double num = Double.parseDouble(each);

            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

        System.out.println("=======================================================");

        String[] arr2 = {"100", "2.5", "3", "3.5", "4.5", "55"};
        double[] numbers = new double[arr2.length];

        for (int i = 0; i < arr2.length; i++) {
            numbers[i] = Double.parseDouble(arr2[i]);
        }
        Arrays.sort(numbers); // sorting

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length - 1]); // max num of numbers

    }
}
