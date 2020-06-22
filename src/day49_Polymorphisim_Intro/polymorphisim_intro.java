package day49_Polymorphisim_Intro;

interface Robot {

}

abstract class Animal implements Robot {

}

class Dog extends Animal {

}

class Cat extends Animal {

}


public class polymorphisim_intro {

    public static void main(String[] args) {
        // Animal obj = new Animal(); cannot create an object from abstract class
        Animal obj1 = new Dog(); // polimorphisim
        Animal obj2 = new Cat();
        Robot obj3 = new Dog();
        Robot obj4 = new Cat();
       // Robot obj5 = new Animal(); Animal is abstract class, cannot create an object

        Robot[] dogs = {obj1, obj2, obj3};

        Animal[] animals = {obj1, obj2};

    }

}
