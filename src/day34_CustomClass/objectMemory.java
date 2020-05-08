package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class objectMemory {

    int i = 100; // instance variable, located in Heap

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        ArrayList<Integer> list2 = list1; // list1 and list2 are belongs to 1 object, location: Stack

        list1.remove(2); // removes index 2 from list1 and list2
        System.out.println(list1);

        System.out.println(list2); // list1 and list2 still the same

        String str1 = new String("cybertek");
        //   reference   object
        String str2 = str1; // both are belong to 1 object

        str1 = str1.toUpperCase(); // created new object: "CYBERTEK"

        System.out.println(str1);
        System.out.println(str2);

        int a = 300; // location: stack, local var


    }
}
