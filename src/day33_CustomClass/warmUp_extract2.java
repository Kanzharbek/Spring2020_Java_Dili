package day33_CustomClass;

import java.util.ArrayList;

public class warmUp_extract2 {
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

        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits.add(str.charAt(i));
            } else if (Character.isLetter(str.charAt(i))) {
                letter.add(str.charAt(i));
            } else {
                specialChars.add(str.charAt(i));
            }
        }
            System.out.println(letter);
            System.out.println(digits);
            System.out.println(specialChars);



    }
}
