package day50_polymorphisim;

/*
3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */
public final class Dog extends Animal {
    public String dogName;

    public Dog(String dogName, int age, String gender) {
        this.dogName = dogName;
        this.age = age;
        this.gender = gender;
    }

    public void bark() {
        System.out.println("Dog " + dogName + " is barking");
    }

    public void eat(){
        System.out.println("Dog " + dogName + "");
    }

    public void sleep(){
        System.out.println("Dog " + dogName + " is sleeping");
    }
}
