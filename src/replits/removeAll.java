package replits;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAll {

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi", "hey", "hi", "yo"));
        String targetWord = "hi";
        System.out.println(wordList);
        removeAll(wordList, targetWord);
        System.out.println(wordList);
    }

    //create your method below
    public static void removeAll(ArrayList<String> wordList, String targetWord) {
            wordList.removeAll(Arrays.asList(targetWord));

    }
}

