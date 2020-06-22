package day50_polymorphisim;

import day48_Abstraction.warmUp.Downloadable;

public class polymorphisim_casting {

    public static void main(String[] args) {
        // primitive implicit casting:
        int a = 100;
        double b = a;

        // upcasting: casting sub class to super class
        Dog dog = new Dog("Bob", 1, "M");
        Animal animal1 = dog; // upcasting, done implicitly

        Cat cat1 = new Cat("C", 1, "F");
        //Dog dgo2 = (Dog) cat1; there is no IS A relationship
        Animal animal2 = cat1; // upcasting, done manually

        System.out.println("---------------------------------------------------------------");

        //down casting
        double c = 10;
        int d = (int)c; // explicit casting, done manually small to large

        Animal animal3 = new Dog("V", 3, "M");
        Dog dog2 = (Dog) animal3; // down casting(explicit), done manually, sub class takes from super class

        Animal animal4 = new Cat("C", 3, "F");
        Cat cat2 = (Cat) animal4;

        System.out.println("---------------------------------------------------------------");

        Animal animal5 = new Dog("k", 4, "M");
        // animal5.bark(); no access to this method
        Dog dog3 = (Dog) animal5; // down casting
        dog3.bark(); // now it has an access
        //second way:
        ((Dog) animal5).bark();





    }

}
