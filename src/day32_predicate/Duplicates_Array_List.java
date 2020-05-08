package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates_Array_List {
    /*
        write a program that can return the duplicated values from an ArrayList of String
		    Ex:
                list: {"A", "B", "A", "C", "D"};
                output: ["A"]
                list: {"A", "B", "B", "C", "D", "D"};
                output: ["A", "C"]
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>(); // store duplicated characters to this ArrayList

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (String each : list) {
                if (each.equals(list.get(i))) { // if each equals to each element off the list than increase count by 1
                    count++;
                }
            }
            if (count > 1 && !duplicates.contains(list.get(i))) { // if duplicates list doesn't contain than add it
                duplicates.add(list.get(i));
            }
        }
        System.out.println(duplicates);

    }
}
