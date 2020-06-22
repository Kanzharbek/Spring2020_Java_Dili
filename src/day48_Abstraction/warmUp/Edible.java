package day48_Abstraction.warmUp;

public interface Edible {
    void eat();
}

interface Drinkable extends Edible {
    void drink();
}

class Burger implements Edible {
    String name;
    String size;

    public Burger(String name, String  size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Eating " + size + " " + name );
    }


}

class IceCoffee implements Drinkable {
    String size;

    public IceCoffee(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "IceCoffee " + size;
    }

    @Override
    public void eat() {
        System.out.println("Ice coffee is not edible");
    }

    @Override
    public void drink() {
        System.out.println("Drinking " + size + " ice coffee");
    }
}

class Test {
    public static void main(String[] args) {
        Burger burger = new Burger("Chicken burger", "Large");
        burger.eat();
        System.out.println(burger);
        System.out.println(burger.size);
        System.out.println(burger.name);

        IceCoffee drink = new IceCoffee("Grande");
        drink.drink();
        drink.eat();
        System.out.println(drink);
        System.out.println(drink.size);

    }
}

