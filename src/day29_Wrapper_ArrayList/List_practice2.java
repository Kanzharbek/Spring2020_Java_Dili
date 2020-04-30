package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_practice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(50);
        list.add(700);
        list.add(800);

        int maximum = Integer.MIN_VALUE; // assigning minimum value if int to maximum variable

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        System.out.println(maximum);

        int maximum2 = Integer.MIN_VALUE;
        for (Integer each : list) {
            maximum2 = each;
        }
        System.out.println(maximum2);

    }
}
