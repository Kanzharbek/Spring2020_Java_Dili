package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class lambda_expressions {

    public static void main(String[] args) {

        Predicate<Integer> oddNumber = x -> x % 2 != 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.removeIf(oddNumber);
        System.out.println(list);

        System.out.println("=============================================");

        Predicate<Integer> lessThan5 = l -> l <= 5;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list2);
        list2.removeIf(lessThan5);
        System.out.println(list2);

        System.out.println("============================================");

        Predicate<String> startWithM = s -> s.toLowerCase().startsWith("m");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza", "Mohammed", "Boris", "Sha", "Bilal", "maria"));
        System.out.println(names);
        names.removeIf(startWithM);
        System.out.println(names);

        System.out.println("============================================");

        Predicate<Character> digits = c -> Character.isDigit(c);

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));

        chars.removeIf(digits);

        System.out.println(chars);

        System.out.println("=================================");
        Predicate<Integer> greaterThan5 = p -> p > 5;
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        // nums.removeIf( p -> p > 5);
        nums.removeIf(greaterThan5);

        System.out.println(nums);


    }
}
