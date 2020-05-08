package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp_extract3 {

    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";

        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        Character[] ch = new Character[arr.length];
        for(int i = 0; i < arr.length; i++){
            ch[i] = arr[i];
        }
        System.out.println(Arrays.toString(ch));

        ArrayList<Character> letter = new ArrayList<>(Arrays.asList(ch));
        letter.removeIf(p -> !Character.isLetter(p));
        System.out.println(letter);

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> specialChars = new ArrayList<>(Arrays.asList(ch));
        specialChars.removeAll(letter);
        specialChars.removeAll(digits);
        System.out.println(specialChars);



    }
}
