package day30_array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_List_Reverse {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            int eachNum = list.get(i); // unboxing
            reversedList.add(eachNum);
        }
        System.out.println(reversedList);

        // assigning to ArrayList to an Array
        int[] arr = new int[reversedList.size()];
        for(int i = 0; i < reversedList.size(); i++){
            arr[i] = reversedList.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
