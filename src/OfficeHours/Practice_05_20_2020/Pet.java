package OfficeHours.Practice_05_20_2020;

public class Pet {
    /*
    variables:  name, age, color, size, breed, isPet, numberOfEyes
            methods:    eat, sleep, drink, toString, setInfo()
     */
    protected String name;
    protected int age;
    protected String color;
    protected String size;
    protected String breed;
    protected static boolean isPet = true;
    protected static int numberOfEyes = 2;

    public void setInfo(String name, int age, String color, String size, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.breed = breed;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Breed: " + breed + ", Name: " + name + ", Color: " + color
                + ", Size: " + size + ", Age: " + age;
    }
}

class Cat extends Pet {
    /*
     name (inherited)
     age (inherited)
     color (inherited)
     size (inherited)
     breed (inherited)
     isPet (inherited)
     numberOfEyes (inherited)

     methods:    eat, sleep, drink, toString (inherited)

     method: scratch() - declared
     */

    public Cat(String name, int age, String color, String size, String breed) {
        setInfo(name, age, color, size, breed); // setInfo() is a method from Pet(super) class
    }

    public void scratch() {
        System.out.println(name + " is scratching");
    }
}

class Dog extends Pet {
    /*
     name (inherited)
     age (inherited)
     color (inherited)
     size (inherited)
     breed (inherited)
     isPet (inherited)
     numberOfEyes (inherited)

     methods:    eat, sleep, drink, toString (inherited)

     method: bark() - declared
     */

    public Dog(String name, int age, String color, String size, String breed) {
        setInfo(name, age, color, size, breed); // setInfo() is a method from Pet(super) class
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}

class Bunny extends Pet {
    /*
     name (inherited)
     age (inherited)
     color (inherited)
     size (inherited)
     breed (inherited)
     isPet (inherited)
     numberOfEyes (inherited)

     methods:    eat, sleep, drink, toString (inherited)

     method: dig() - declared
     */

    public Bunny(String name, int age, String color, String size, String breed) {
        setInfo(name, age, color, size, breed); // setInfo() is a method from Pet(super) class
    }

    public void dig() {
        System.out.println(name + " is digging");
    }
}
