package day52_Collections;

import java.util.*;

public class Lists {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        // Array based and singly linked list(means faster to retrieve a data)
        list1.add(1);
        System.out.println(list1);

        List<Integer> list2 = new LinkedList<>();
        //doubly linked list(slower to retrieve but faster to add & remove)
        list2.add(2);
        System.out.println(list2.get(0));

        List<Integer> list3 = new Vector<>();
        list3.add(3);

        System.out.println("--------------------------------------------------------------------");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        System.out.println(arrayList);

        Vector<Integer> vector = new Vector<>(); // Array based, synchronized
        vector.add(10);
        System.out.println(vector);

        Stack<Integer> stack = new Stack<>(); // Array based, synchronized
        stack.add(10);

        System.out.println("-------------------------------------------------------------------------");

        Stack<String> names = new Stack<>();
        names.add("Sha");
        names.add("Dovran");
        names.add("Rahman");
        names.add("Anna");
        names.add("Rustem");
        System.out.println(names);

        String s1 = names.pop(); // it will return last added element("Rustem") and remove it from the list
        System.out.println(s1);
        System.out.println(names);

        String s2 = names.pop(); // it return last added element and removes it from the list. "Anna"
        System.out.println(names);

        names.push("Dilnaz");
        System.out.println(names);
    }


}
