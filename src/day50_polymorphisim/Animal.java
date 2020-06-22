package day50_polymorphisim;

/*
1. create a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make abstract we need this for today's example
 */
public abstract class Animal {
    public int age;
    public String gender;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
