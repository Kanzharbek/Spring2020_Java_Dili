package day52_Collections;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice {

    public static void main(String[] args) {
        String str1 = "abababab";
        String str2 = "baba";

        /*
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        TreeSet<String> t1 = new TreeSet<>(Arrays.asList(arr1)); // ab
        TreeSet<String> t2 = new TreeSet<>(Arrays.asList(arr2)); // ab

        System.out.println(t1);
        System.out.println(t2);

        str1 = t1.toString();
        str2 = t2.toString();
        System.out.println(str1);
        System.out.println(str2);
        */

        str1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString().toLowerCase();
        str2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString().toLowerCase();
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.equals(str2));



    }
}
