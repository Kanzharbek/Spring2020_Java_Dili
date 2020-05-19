package day37_Constructor;

public class carObjects {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2014, 13_000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1);

        Car car2 = new Car("Audi", "Q5", 2019, 65_000);
        System.out.println(car2);


    }
}
