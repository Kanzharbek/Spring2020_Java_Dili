package replits;

import java.util.Arrays;

public class AsessmentTest2_Arrays_Sorting {

    public static void main(String[] args) {
        int[] nums = {1, 11, 2, 3, 4, 13, 5, 6, 12, 7, 8, 9};
        int[] sorted = new int[nums.length];

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            sorted[j] = nums[i];
            j++;
        }
        System.out.println(Arrays.toString(sorted)+" is sorted");
        System.out.println(Arrays.toString(nums)+" is nums");
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted)+" is sorted");


        if (nums.equals(sorted)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
