package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_practice {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Coffee");
        shoppingList.add("Bread");
        shoppingList.add("Toilet Paper");
        shoppingList.add("Eggs");
        System.out.println(shoppingList);

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }

        for (String each : shoppingList) {
            System.out.println(each);
        }

        // size():

        int size = shoppingList.size();
        System.out.println(size);

        int lastIndex = shoppingList.size();
        System.out.println(lastIndex);


    }
}
