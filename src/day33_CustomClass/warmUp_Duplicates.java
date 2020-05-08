package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmUp_Duplicates {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 4, 5, 5));
        System.out.println(list);

        list.removeIf(p -> Collections.frequency(list, p)==1);
        // if frequency of p is equal to 1 than remove it from list. p: each element of list
        System.out.println(list);
    }
}
