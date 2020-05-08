package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class quiz {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Rob", "Bran", "Rick", "Bran"));

        if(names.remove("Bran")){ // { "Rob", "Rick", "Bran"
            names.remove("John"); // "John" is not in the List
        }
        System.out.println(names);
    }
}
