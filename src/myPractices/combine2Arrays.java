package myPractices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class combine2Arrays {
    /*
    public static String[] combineNames(String[] first_names, String[] last_names){

        String[] firstLast_names = new String[first_names.length+last_names.length];

        for(int i = 0; i < first_names.length; i++){
            for(int j =0; j < last_names.length; j++ )
                firstLast_names[i] = first_names[i]+last_names[j];
        }
        return firstLast_names;
    }

     */

    public static void main(String[] args){
        //feel free to test code here
        String[] first_names = {"Dilnaz", "Kanjar"};
        String[] last_names = {"Sherali", "Anarbaev"};

        String[] combineNames = new String[(first_names.length+last_names.length)-2];

        for(int i = 0; i < combineNames.length; i++){

            combineNames[i] = first_names[i]+" "+last_names[i];
        }
        System.out.println(Arrays.toString(combineNames));

    }
}
