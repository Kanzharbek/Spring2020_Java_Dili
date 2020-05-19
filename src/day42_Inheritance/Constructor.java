package day42_Inheritance;

import OfficeHours.Practice_05_13_2020.ConstructorOverloading;

class test { // parent class

    public test() {
        System.out.println("super class' default constructor");
    }

}

public class Constructor extends test { // child class

    public Constructor() {
        System.out.println("sub class' default constructor");
    }

    public static void main(String[] args) {

        Constructor obj = new Constructor();

    }

}
