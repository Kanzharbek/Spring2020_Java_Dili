package day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(){ // sets the default value for all instances
        name = "unknown";
        breed = "unknown";
        age = 0;
    }

    public Dog(String breed){ //
        this.breed = breed;
        name = "unknown";
        age = 0;
    }

    public Dog(int age){
        this.age = age;
        name = "unknown";
    }

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String toString(){
        return "Name: "+name +", breed: "+breed+", age: "+age;
    }
}

class dogObjects{

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);

        Dog dog2 = new Dog("Pomeranian");
        System.out.println(dog2.breed);
        System.out.println(dog2.name);

        Dog dog3 = new Dog();

        System.out.println( dog3.name );
        System.out.println( dog3.breed ); // poodle
        System.out.println( dog3.age ); // 4

        System.out.println("==========================================");

        System.out.println(dog3);
        System.out.println( dog2 );
        System.out.println(dog1);

    }
}
