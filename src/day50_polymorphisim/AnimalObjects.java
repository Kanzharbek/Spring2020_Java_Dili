package day50_polymorphisim;

public class AnimalObjects {

    public static void main(String[] args) {

        Cat cat3 = new Cat("lala", 2, "F");
        cat3.scratch();
        System.out.println(cat3.catName);

        Dog dog3 = new Dog("Fas", 6, "M");
        dog3.bark();
        System.out.println(dog3.dogName);

        System.out.println("------------------------------------------------------------------------");

        Animal cat1 = new Cat("Lucy", 5, "F");
        // cat1.scratch(); reference type: Animal, has no access to this method. This method is in Cat class
        Animal cat2 = new Cat("Popo", 7, "M");
        cat1.eat(); //

        Animal dog1 = new Dog("Barbos", 10, "F");
        //dog1.bark(); reference type: Animal, has no access to this method. This method is in Dog class
        Animal dog2 = new Dog("Tarzan", 3, "M");

        Animal[] animals = {cat1, cat2, dog1, dog2};
        for (Animal each : animals) {
            System.out.println(each);
        }

        System.out.println("------------------------------------------------------------------------");

        Animal animal1 = new Cat("ahi", 1, "F");

        boolean isCat = animal1 instanceof Cat;
        System.out.println(isCat);

        if (animal1 instanceof Dog) {
            System.out.println("it's a dog");
        } else if (animal1 instanceof Cat) {
            System.out.println("It's a cat");
        } else {
            System.out.println("N/A");
        }

        // Dog d1 = new Cat("Bibi", 3, "F"); Dog cannot be a reference to a Cat, there is no IS A relationship
        // boolean d1 = d1 instanceof Cat; Dog ~ Cat --> no IS A relationship

        Animal animal3 = new Cat("Haha", 4, "M");
        boolean a1 = animal3 instanceof Cat;
        System.out.println(a1);


    }
}
