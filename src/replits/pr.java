package replits;

import java.util.ArrayList;
import java.util.Arrays;

public class pr {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, -1, -2, -3, 0));
        System.out.println(list);
        ArrayList<Integer> positiveNum = new ArrayList<>();
        for(Integer each : list){
            if(each>=0){
                positiveNum.add(each);
            }
        }
        System.out.println(positiveNum);
        Integer sum = 0;
        for(Integer each : positiveNum){
            sum += each;
            positiveNum.add(sum);
        }
        System.out.println(sum);
        System.out.println(positiveNum);
    }
    }

