package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    /*
    create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
     */
    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) { // Constructor
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost() {

        return quantity * unitPrice;
    }

    public String toString() {
        return "Item: " + name + ", Unit price: $" + unitPrice + ", quantity: " + quantity +
                "\nTotal cost of Item: $" + calcCost();
    }
}

class shoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("Coffee", 11.9, 1);
        Item item2 = new Item("Happy Baby", 1.29, 4);
        Item item3 = new Item("Almond milk", 12, 1);
        Item item4 = new Item("Onion", 0.99, 5);
        Item item5 = new Item("Pear", 2.99, 6);

        System.out.println(item1.calcCost());
        System.out.println(item1);

        ArrayList<Item> list = new ArrayList<>(Arrays.asList(item1, item2, item3, item4, item5));

        double totalCost = 0;
        for (int i = 0; i < list.size(); i++) {
            totalCost += list.get(i).calcCost();
        }
        System.out.println(totalCost);

        double totalCost1 = 0;
        for (Item each : list) {
            totalCost1 += each.calcCost();
        }
        System.out.println(totalCost1);

    }
}



