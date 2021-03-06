package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmUp_Uniques {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 4, 5, 5));
        System.out.println(list);

        list.removeIf((p -> Collections.frequency(list, p) > 1));
        /*
        p represents each element in list. "Collections.frequency(list, p)" checks how many p(elements)
        repeated in list and should be more than 1.
         */
        System.out.println(list);


    }
}
