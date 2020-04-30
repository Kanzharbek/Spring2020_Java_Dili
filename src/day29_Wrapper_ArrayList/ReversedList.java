package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class ReversedList {
    /*
    write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i)+" ");
        }



    }
}
