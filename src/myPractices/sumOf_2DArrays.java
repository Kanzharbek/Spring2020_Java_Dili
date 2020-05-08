package myPractices;

import java.util.Arrays;

public class sumOf_2DArrays {

    public static void main(String[] args) {

        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int[] sum = new int[a.length];

        for(int i = 0; i < a.length; i++){ // i: each 1D Array
            for(int j = 0; j < a[i].length; j++){ //j: each element of 1D
                sum[i] += a[i][j];
            }
        }
        System.out.println(Arrays.toString(sum));
    }
}
