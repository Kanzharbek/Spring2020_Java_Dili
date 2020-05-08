package day35_Static;

public class Dog {

    String breed; // instance variable
    static String color;
    static boolean isPet;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.color = "White"; // variable color == white
        dog1.isPet = true; // isPet: true

        Dog dog2 = new Dog();
        dog2.breed = "Pomeranian";
        dog2.color = "Black"; // variable color == black  for dog1 and dog2. reassigned
        dog2.isPet = false; // isPet: reassigned to false

        System.out.println(dog1.breed); // Husky
        System.out.println(dog2.breed); // Pomeranian

        System.out.println(dog1.color); // Black
        System.out.println(dog2.color); // Black

        System.out.println(dog1.isPet); // false
        System.out.println(dog2.isPet); // false
    }
}
