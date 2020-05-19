package day41_Inheritance;

public class Animal {
    /*
        Name
        Size
        Weight

        Action: eat, move
    */

    public String name;
    public String size;
    public double weight;

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void move() {
        System.out.println(name + " is moving");
    }
}

class Dog extends Animal { // Dog is inheriting from Animal: public vars and methods

    public void bark() {
        System.out.println(name + " is barking");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.name = "Lily"; // dog1 can access to name variable from Animal
        dog1.size = "Small"; // because all of them are public and inherited from Animal parent class
        dog1.weight = 7; // now Dog is child class to Animal parent class

        System.out.println(dog1.name); // lily
        System.out.println(dog1.size); // Small
        System.out.println(dog1.weight); // 7

        dog1.eat(); // Lily is eating: eat() is method from Animal class
        dog1.move(); // Lily is moving: move() is method from Animal class

        dog1.bark(); // Lily is barking: bark() is local instance method in Dog class

    }
}

class Fish extends Animal {

    public void swim() { // this method belongs to Fish class
        System.out.println(name + " is swimming");
    }

    public static void main(String[] args) {

        Fish fish1 = new Fish(); // new object in Fish class
        fish1.name = "Nemo"; // assigning name: name is public instance variable from Animal parent class
        fish1.size = "Tiny";
        fish1.weight = 5;

        fish1.eat(); // Nemo is eating: eat() is method from Animal class
        fish1.move(); // Nemo is moving: move() is method from Animal class

        fish1.swim(); // Nemo is swimming : swim is local method in Fish class


    }
}
