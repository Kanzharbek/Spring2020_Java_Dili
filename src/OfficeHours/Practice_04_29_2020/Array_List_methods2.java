package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class Array_List_methods2 {

    public static void main(String[] args) {
        //indexOf(Object) ==> returns the index num
        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('A');  //0
        list1.add('B'); //1
        list1.add('C'); //2
        list1.add('D'); //3
        list1.add('C'); //4
        int indexNum = list1.indexOf('C');
        int lastIndexOf = list1.lastIndexOf('C');
// list1.remove(list1.lastIndexOf('C'));
        System.out.println(list1);
        System.out.println(indexNum);
        System.out.println(lastIndexOf);
        System.out.println("============================================");
        //COMBINE TWO ARRAYS
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10,11,12,13};
        ArrayList<Integer> combineArrs = new ArrayList<>();
        for ( int each   : arr1  ){
            combineArrs.add(each);
        }
        System.out.println(combineArrs);
        for ( int each2   : arr2  ){
            combineArrs.add(each2);
        }
        System.out.println(combineArrs);



    }
}
