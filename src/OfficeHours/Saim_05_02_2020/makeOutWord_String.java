package OfficeHours.Saim_05_02_2020;

public class makeOutWord_String {

    public static void main(String[] args) {

        String out = "<<>>";
        String word = "Ali";
        System.out.println(makeOutWord(out, word));
    }
    public static String makeOutWord(String out, String word){
        String newWord = out.substring(0, 2)+word+out.substring(out.length()-2);
        return newWord;

    }
}
