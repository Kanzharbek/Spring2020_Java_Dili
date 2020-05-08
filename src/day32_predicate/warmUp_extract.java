package day32_predicate;

import java.util.ArrayList;

public class warmUp_extract {
    /*
    write a program that can extract the special characters,
    digits and alphabets from a string
    and stores them into separate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char[] ch = str.toCharArray();
        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();


        for (char each : ch) {
            if (Character.isDigit(each)) {
                digits.add(each);
            } else if (Character.isLetter(each)) {
                letter.add(each);
            } else {
                specialChars.add(each);
            }
        }
        System.out.println(letter);
        System.out.println(digits);
        System.out.println(specialChars);







    }
}
