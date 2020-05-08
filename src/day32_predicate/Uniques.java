package day32_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    //write a program that can return unique objects from ArrayList of characters
    public static void main(String[] args) {
        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        ArrayList<Character> result = new ArrayList<>(); // to store Unique objects
        for (int i = 0; i < charList.size(); i++) {
            int count = Collections.frequency(charList, charList.get(i)); // count the frequency of characters in charList
            if (count == 1) {// if count is equal to 1
                result.add(charList.get(i)); // store elements in result list
            }
        }
        System.out.println(result);
        for (Character each : charList){
            int count = Collections.frequency(charList, charList.get(each));
            if(count==1){
                result.add(charList.get(each));
            }
        }
        System.out.println(result);

    }
}
