package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class bulk_removeAll {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Java", "Python", "C++", "Shell"));
        System.out.println(list);

        list.removeAll(Arrays.asList("Python", "Shell"));
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 3, 3, 3, 3, 3, 1, 1, 1, 2, 2, 2, 2));
        // remove 1, 3, 5, 8

        /*
        Integer a = 1;
        list1.remove(a); // removes element 1
        list1.remove(a);
        System.out.println(list1);

        Integer b = 3;
        list1.remove(b);
        System.out.println(list1);
         */

        list1.removeAll(Arrays.asList(3, 1, 2));
        System.out.println(list1);

        System.out.println("=========================================================");
        // remove all names ahmed
        String[] names = {"Ahmed", "John", "Aaron", "Ahmed", "Daniel", "Ahmed", "Ahmed"};

        ArrayList<String> nameList = new ArrayList<>( Arrays.asList(names) );
        System.out.println(nameList);

        nameList.removeAll(  Arrays.asList("Ahmed")  );

        System.out.println(nameList);


    }
}
