package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collectionsMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, -1, 10, -2, 2, 3, 4, 5, 6, 7, 8, 9));

        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list1);
        Collections.swap(list1, 0, 4);
        System.out.println(list1);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer", "Omer", "Mary", "Sha", "Fatih", "Omer"));
        System.out.println(names);
        //names.set(0, "Irina");
        //names.set(1, "Irina");
        Collections.replaceAll(names, "Omer", "Irina");
        System.out.println(names);

    }
}
