package day30_array_List;

import java.util.ArrayList;

public class Array_List_methods2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        String str = "F"; // not in the List
        boolean r1 = list.remove(str); // boolean expression depends on method
        boolean r2 = list.remove("A"); // true
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(list);

        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("==============================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        int num1 = list2.indexOf(1); // Integer = int ==> Autoboxing
        System.out.println(num1);

        int num2 = list2.indexOf(100); // if object does not exist it will print negative number index
        System.out.println(num2); // negative index number

        int num3 = list2.indexOf(3);
        System.out.println(num3);
    }
}
