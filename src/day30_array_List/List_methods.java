package day30_array_List;

import java.util.ArrayList;

public class List_methods {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(7);
        list1.add(8);
        System.out.println(list1);

        //list1.add(6); // {5,7,8,6}
        list1.add(1, 6); // {5,6,7,8}
        System.out.println(list1);

        int[] arr = {1, 2, 3, 4};
        arr[3] = 5;

        list1.set(3, 9);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add(1, "C");
        list2.add(1, "D");
        System.out.println(list2);
        list2.set(3, "F");
        list2.set(2, "E");
        System.out.println(list2);

        // remove()
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        System.out.println(list3);
        list3.remove(1);
        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        list4.add(40);
        System.out.println(list4);
        list4.remove(1);
        System.out.println(list4);
        // list1.remove(20); // index out of bound
        Integer a = 30;
        list4.remove(a);
        System.out.println(list4);


    }
}
