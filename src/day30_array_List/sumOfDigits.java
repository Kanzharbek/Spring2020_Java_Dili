package day30_array_List;

import java.sql.SQLOutput;
import java.util.Arrays;

public class sumOfDigits {
    /*
        write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
     */
    public static void main(String[] args) {

        String str = "a1b2c3";
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        int sum = 0;
        for (char each : ch) {
            /*
            if (each >= 48 && each <= 57) {  // char between 0 ~ 9 represents numbers between 48-57
                sum += Integer.parseInt("" + each);
            }
            */
            if (Character.isDigit(each)) { // isDigit: identifies if given character is Digit
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);

        boolean a = Character.isAlphabetic('A'); // identifies if character is alphabet

        /*
        extract the digits and letters from a String
         */

        String str1 = "AliKanjar11/13/2019";
        char[] ch1 = str1.toCharArray();
        System.out.println(Arrays.toString(ch1));

        int num = 0;
        String letters = "";

        for(char each : ch1){
            if(Character.isAlphabetic(each)){
                letters += ""+each;
            }
            if(Character.isDigit(each)){
                num = Integer.parseInt(""+each);
            }
        }
        System.out.println(letters);
        System.out.println(num);



    }
}
