package day31_BulkOperations;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class bulk_containAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);
        /*
            if 10, 20, 60 if all objects are exist in ArrayList ==> true
            otherwise == > false
        */
        boolean b1 = list1.contains(10);
        boolean b2 = list1.contains(20);
        boolean b3 = list1.contains(60);
        boolean result = b1 == true && b2 == true && b3 == true; // result: false. 60 is not on the ArrayList
        System.out.println(result);
        /*
            if 10, 20, 60, 80, 90, 100, 200, 300 if all objects are exist in ArrayList ==> true
            otherwise == > false
        */
        boolean b4 = list1.containsAll(Arrays.asList(10, 20, 60, 80, 90, 100, 200, 300)); // false
        System.out.println(b4);

        boolean b5 = list1.containsAll(Arrays.asList(10, 20, 30, 40)); // true
                                                    // CollectionType
        System.out.println(b5);

        // 10, 20, 40
        Integer[] data = {10, 20, 40};
        boolean b6 = list1.containsAll(Arrays.asList(data)); // true
        System.out.println(b6);



    }
}
