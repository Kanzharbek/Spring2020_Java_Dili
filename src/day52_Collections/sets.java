package day52_Collections;

import java.util.*;

public class sets {

    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<String>(); // LinkedHashSet keeps order as it is
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        System.out.println(names); // Sha, Zuura, Saban, Ozgur
        System.out.println(names.size()); // 4, duplicates will not be added

        System.out.println("--------------------------------------------------------");

        String[] arr = {"A", "A", "C", "B", "A"};
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(arr)); // does not accept duplicates
        System.out.println(set1); // A C B
        //System.out.println(set1.get(1)); // no index number in Set
        System.out.println(set1.size()); // 3

        System.out.println("----------------------------------------------------------");
        Set<Integer> numbers = new TreeSet<>(); // TreeSet --> removes the duplicates and sorts
        numbers.addAll(Arrays.asList(3, 1, 4, 2, 5, 1, 3, 2, 4, 5));
        System.out.println(numbers);

        System.out.println("-------------------------------------------------------------------------");

        TreeSet<String> treeSet = new TreeSet<>();
        //treeSet.add(null); // TreeSet does not accept null
        //System.out.println(treeSet); // NullPointException

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);
        System.out.println(hashSet); // HashSet accepts null

        System.out.println("---------------------------------------------------------------------");

        String number = null;
        int number2 = Integer.parseInt(number);
        System.out.println(number2); // NullPointerException


    }
}
