package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;
/*
    ArrayList: does not support primitives
               size is dynamic, size is auto-adjusted
               has index numbers

               add(), get(), set(), clear(), indexOf(), lastIndexOf()

               add(): inserting
               set(): replacing
               remove(int):
               remove(object):

 */

public class Array_List_methods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20); // {10, 20}

        list.add(2, 30); // adds the element at the given index
        //          {10, 30, 20}

        System.out.println(list);
        System.out.println(list.size()); // size of ArrayList

        // { 10, 30, 20 }
        //   0   1   2

        int n = list.get(2); // Integer 20. Wrapper class can be assigned to primitives-unboxing
        System.out.println(n);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        System.out.println(list2); // {A, B, C, D}

        list2.add(2, "E"); // add "E" to index 2
        System.out.println(list2); // {A, B, E, C, D}

        for (int i = 0; i < list2.size(); i++) { // i: 0, 1, 2, 3, 4
            String str = list2.get(i);
            System.out.println(str);
        }
        System.out.println("===================================================");
        for (String each : list2) { // each: each elements of Arraylist
            String str = each;
            System.out.println(str);
        }

        // list2: {A, B, E, C, D} ,  replace C with F

        list2.set(3, "F");
        System.out.println(list2);

        //  list2: //{A,B,E,F,D}
        //  0 1 2 3 4

        list2.remove(3); //{A,B,E,D}

        System.out.println(list2);

        // list2: /{A,B,E,D}

        boolean r1 = list2.remove("A");  //{B,E,D}
        System.out.println(list2);

        System.out.println(r1);

        boolean r2 = list2.remove("Z");
        System.out.println(r2);

        list2.clear(); // size: 0
        System.out.println(list2.size());

        System.out.println(list2);


    }
}
