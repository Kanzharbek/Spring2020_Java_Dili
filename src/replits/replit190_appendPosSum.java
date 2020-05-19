package replits;

import java.util.ArrayList;
import java.util.Arrays;

public class replit190_appendPosSum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, -2, -9, -7, 5));
        System.out.println(appendPosSum(list));
    }

    //create your method below
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {
        ArrayList<Integer> positiveNum = new ArrayList<>();
        for (Integer each : list) {
            if (each > 0) {
                positiveNum.add(each);
            }
        }
        Integer sum = 0;
        for (Integer each : positiveNum) {
            sum += each;
        }
        positiveNum.add(sum);
        return positiveNum;
    }
}

