package OfficeHours.Saim_06_03_2020;

import java.util.Arrays;

public class ReverseEachWord {
    /*
    6) Create a method that will accept a String
    of multiple words separated by a space and
    return the String with which part reversed.
    Ex: "The house is big"
	-> eht esuoh si gib
     */

    public static String reverseEachWord(String str){
        String[] words = str.split(" "); // splitting words in sentence by empty spaces.

        System.out.println(Arrays.toString(words)); // print Array words: each word

        String reversed = "";

        for(String word : words){
            reversed += reverse(word)+" "; // using reverse method to reverse each word in Array words
        }
        return reversed;
    }

    public static String reverse(String word){
        String rev = "";
        for(int i = word.length()-1; i >= 0; i--){
            rev += word.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {

        String str = "House is big";
        String word = "Dilnaz";
        System.out.println(reverse(word));
        System.out.println(reverseEachWord(str));

    }
}
