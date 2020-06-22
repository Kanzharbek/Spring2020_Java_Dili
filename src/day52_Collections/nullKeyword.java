package day52_Collections;

import java.util.ArrayList;

public class nullKeyword {

    static String str1 = new String("Cybertek");
    static String str2;    // == null

    static ArrayList<Integer> list1; // null

    public static void main(String[] args) {
        System.out.println(str1.charAt(0)); // C
        //System.out.println(str2.charAt(0)); // NullPointerException
        //System.out.println(list1.get(0)); // NullPointerException

        //WebElement element = null;

        String str3 = null;
        Integer i1 = null;

        // int num = null; we cannot assign null to primitive data type

        ArrayList<String> list2 = new ArrayList<>();
        list2.add(null);
        System.out.println(list2);


    }
}
