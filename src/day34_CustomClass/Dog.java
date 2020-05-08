package day34_CustomClass;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void setDogInfo(String dogBreed, String dogSize, int dogAge, String dogColor, String dogName) {
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
        name = dogName;
    }

    public String toString() { return "Name: " + name + ", Color: " + color + ", Size: " + size + ", Age: " + age; }

    public void eat(String food) { System.out.println(name + " is eating " + food); }

    public void drinking(String drink) { System.out.println(name + " is drinking " + drink); }

    public void playing(String toy){ System.out.println(name+" is playing "+toy); }

    public void studying(String subject){ System.out.println(name+" is studying "+subject); }

}
