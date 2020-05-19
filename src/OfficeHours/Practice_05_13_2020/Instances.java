package OfficeHours.Practice_05_13_2020;

public class Instances {

    String name; // instance variable

    public void printName(){ // instance method
        System.out.println("Name is: " + this.name);
    }

    { // Instance block: to initialize instance vars
        name = "Zuura";
    }

}

class test{

    public static void main(String[] args) {

        Instances obj1 = new Instances();
        obj1.name = "Muhtar";

        Instances obj2 = new Instances();
        obj2.name = "Kuzzat";

        System.out.println(obj1.name); // Muhtar
        System.out.println(obj2.name); // Kuzzat

        obj1.printName(); // Name is Muhtar
        obj2.printName(); // Name is Kuzzat
    }

}

class InstanceBlock{

    public static void main(String[] args) {

        Instances obj = new Instances();
        System.out.println(obj.name); // Zuura

    }
}
