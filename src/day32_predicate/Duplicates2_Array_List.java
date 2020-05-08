package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates2_Array_List {
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
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "D"));
        System.out.println(list);

        ArrayList<String> result = new ArrayList<>();

        // for loop
        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i)); // frequency of every single element and assign to count variable
            if (count > 1 && !result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }
        System.out.println(result);

        // for each loop
        for(String each : list){
            int count = Collections.frequency(list, each); // frequency of every single element and assign to count variable

            if(count > 1){
                if(result.contains(each)){
                    continue;
                }
                result.add(each);
            }
        }
        System.out.println(result);




    }
}
