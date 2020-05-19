package OfficeHours.Saim_05_09_2020;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) { // iteration stops in the middle of the word
            if (str.charAt(i) != str.charAt((str.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("aziza"));
    }
}
