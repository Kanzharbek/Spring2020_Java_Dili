package day30_array_List;

import java.util.ArrayList;

public class uniques_ArrayList {
    /*
    write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(3);
        System.out.println(list);

        ArrayList<Integer> uniques = new ArrayList<>();

        // for loop
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (Integer each : list) {
                if (each == list.get(i)) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(list.get(i));
            }
        }
        System.out.println(uniques);

        // for each loop
        for(Integer each1 : list){
            int count = 0;
            for (Integer each : list) {
                if (each == list.get(each1)) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(list.get(each1));
            }
        }
    }
}
