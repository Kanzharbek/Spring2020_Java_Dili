package replits;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatElementTwice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(list));
    }
    //create your method below
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
        ArrayList<Integer> repeated = new ArrayList<>();
        for(Integer each : list){
            repeated.add(each);
        }
        Integer index = 0;
        for(Integer each : list){
            repeated.add(index, each);
            index+=2;
        }
        return repeated;
    }
    }

