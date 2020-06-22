package myPractices;

import java.util.Arrays;

public class sortNumbersLetters {

    public static void sortNumbersLetters(String str){
        String letters = "";
        String digits = "";
        char[] arr = str.toCharArray();
        for (char each:arr) {
            if(Character.isDigit(each)){
                digits+=each;
            }
            if(Character.isAlphabetic(each)){
             letters+=each;
            }
        }
        System.out.println(letters);
        System.out.println(digits);


    }

    public static void main(String[] args) {
        String str = "1a2b3c4d";
        String letters = "";
        String num = "";

//        char[] arr = str.toCharArray();
//        System.out.println(Arrays.toString(arr));

//        for (char each : arr){
//            if(Character.isAlphabetic(each)){
//                letters+=each;
//            }else if(Character.isDigit(each)){
//                num+=each;
//            }
//        }
//        System.out.println(letters);
//        System.out.println(num);
        sortNumbersLetters(str);


    }
}
