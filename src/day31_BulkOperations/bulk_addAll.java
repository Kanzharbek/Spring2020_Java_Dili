package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class bulk_addAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        // add 30, 20, 40, 50, 45, 35, 200

        /*
                list1.add(30);
                list1.add(20);
                list1.add(40);
                list1.add(50);
                list1.add(45);
                list1.add(35);
                list1.add(200);
                System.out.println(list1);
         */

        //list1.addAll(Arrays.asList(30, 20, 40, 50, 45, 35, 200));
        //System.out.println(list1);

        //int[] arr1 = {30, 20, 40, 50, 45, 35, 200}; //we need collection type of Array, because ArrayList does not support primitives
        Integer[] arr1 = {30, 20, 40, 50, 45, 35, 200};
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);

        System.out.println("===============================================");

        String[] nameR = {"Ali", "Dili", "Kanjar", "Ayaruu", "Jazmine"};
        //nameR[5] = "Osman"; // error: Array' size is fixed. Cannot append another name
        System.out.println(Arrays.toString(nameR));

        ArrayList<String> nameL = new ArrayList<>();
        nameL.addAll(Arrays.asList(nameR));
        // CollectionType
        System.out.println(nameL);

        nameL.add("Omar");
        System.out.println(nameL);

        nameL.remove("Ayaruu");
        System.out.println(nameL);

        System.out.println("=========================");

        Integer[] numR = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> numL = new ArrayList<>(Arrays.asList(numR));

        System.out.println(numL);


    }
}
