package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class warmUp_country_names {
    /*
            1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater
     */
    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.addAll(Arrays.asList("Kyrgyzstan", "Kazakhstan", "Uzbekistan", "Russia", "India", "South Korea", "France"));
        Predicate<String> remove = r -> r.length() >= 10;
        countryNames.removeIf(remove);
        System.out.println(countryNames);


    }
}
