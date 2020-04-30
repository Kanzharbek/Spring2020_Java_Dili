package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Collections;

public class List_sorting {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(20);
        System.out.println(list);

        Collections.sort(list); // sorting in ascending order
        System.out.println(list);

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) { // i: each element of list
            // System.out.print(list.get(i)+" "); // prints reversed arrayList
            reversedList.add(list.get(i)); // adding reversed list to new arrayList
        }
        System.out.println(reversedList);

        list = reversedList; // assigning reversed arrayList to list. Because list is still in ascending order
        System.out.println(list);


    }
}
