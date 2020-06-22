package myPractices;

public class sortNumbersLetters {

    public static void sortNumbersLetters(String str){
        String letters = "";
        int number = 0;
        char[] arr = str.toCharArray();
        for (char each:arr) {
            if(Character.isDigit(each)){
                number+=each;
            }
            if(Character.is(each)){
             letters+=each;
            }
        }

    }

    public static void main(String[] args) {
        sortNumbersLetters("Batch18-1");
    }
}
