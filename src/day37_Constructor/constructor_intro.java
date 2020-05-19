package day37_Constructor;

public class constructor_intro {

    int age;
    String name;
    public constructor_intro(){
        System.out.println("Hi");
    }

    public constructor_intro(int age) { // constructor' name MUST match the class' name
        this.age = age;
        System.out.println(age); // this will print 1 time with object
    }

    public constructor_intro(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        constructor_intro obj = new constructor_intro();
        //System.out.println(obj.age);


        /*
        constructor_intro obj2 = new constructor_intro("Ali");
        System.out.println(obj2.name);
        System.out.println(obj2.age);

         */


    }
}
