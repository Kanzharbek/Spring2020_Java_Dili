package OfficeHours.Practice_05_20_2020;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Tarzan", 7, "Black", "Large", "Avcharka");

        //dog1.setInfo("Tarzan", 7, "Black", "Large", "Avcharka");
        System.out.println(dog1);

        dog1.bark();
        dog1.eat("cereal");
        dog1.drink("water");
        dog1.sleep();


        Cat cat1 = new Cat("Miau", 3, "Yellow", "Small", "Koshka");
        System.out.println(cat1);

        cat1.scratch();
        cat1.eat("Cereal");
        cat1.drink("Milk");
        cat1.sleep();

        Bunny bun1 = new Bunny("Bibi", 1, "Grey", "Medium", "Koen");
        System.out.println(bun1);

        bun1.dig();
        bun1.eat("carrot");
        bun1.drink("juice");
        bun1.sleep();
    }
}
