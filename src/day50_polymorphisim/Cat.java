package day50_polymorphisim;
/*
2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
 */
public final class Cat extends Animal {
    public String catName;

    public Cat(String catName, int age, String gender) {
        this.catName = catName;
        this.age = age;
        this.gender = gender;
    }

    public void scratch() {
        System.out.println("Cat " + catName + " is scratching");
    }

    @Override
    public void eat(){
        System.out.println("Cat " + catName + " is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat " + catName + " is sleeping");
    }


}
