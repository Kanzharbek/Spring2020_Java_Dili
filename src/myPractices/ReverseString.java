package myPractices;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString("Dilnaz"));

    }

    public static String reverseString(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }
}
