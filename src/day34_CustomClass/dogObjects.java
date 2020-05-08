package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class dogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "Medium", 5, "Brown", "Barbos");
        System.out.println(dog1.breed);
        System.out.println(dog1.color);
        System.out.println(dog1.age);
        System.out.println(dog1.size);
        System.out.println(dog1.name);

        System.out.println("--------------------------------------------------------------------------------");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");
        System.out.println(dog2);

        System.out.println("--------------------------------------------------------------------------------");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");
        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "Smallest", 2, "Brown", "Hihi");

        Dog dog5 = new Dog();
        dog5.setDogInfo("Alabay", "Big", 7, "Black", "Rex");

        System.out.println("--------------------------------------------------------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        for (Dog each : dogs) {
            System.out.println(each);
        }

        System.out.println("--------------------------------------------------------------------------------");

        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));
        //System.out.println(puppies);

        for (int i = 0; i < puppies.size(); i++) {
            Dog eachDogs = puppies.get(i);
            System.out.println(eachDogs);
        }

        System.out.println("--------------------------------------------------------------------------------");

        puppies.removeIf(p -> p.age > 2);
        for (int i = 0; i < puppies.size(); i++) {
            Dog eachDogs = puppies.get(i);
            System.out.println(eachDogs);
        }


    }
}
