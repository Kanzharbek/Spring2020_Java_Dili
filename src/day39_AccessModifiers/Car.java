package day39_AccessModifiers;

public class Car {
    /*
    create a class called Car:
				instance variable:
						brand, model, year, price
				add a constructor that can initialize brand of car
				add a constructor that can initialize brand and model of the car
								(apply constructor call to initialize the brand)
				add a constructor that can initialize the brand, model, year of the car
								(apply constructor call to initialize brand, model)
				add a constructor that can initialize brand, model, year and price of the car
								(apply constructor call to initialize brand, model, year)
				add toString method
     */
    String brand;
    String model;
    int year;
    double price;
    boolean hybrid;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this(brand); // this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int year) {
        this(brand, model);
        // this.brand = brand; this.model = model;
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
        this(brand, model, year);
        // this.brand = brand; this.model = model; this.year = year;
        this.price = price;
    }

    public Car(String brand, String model, int year, double price, boolean hybrid) {
        this(brand, model, year, price);
        // this.brand = brand; this.model = model; this.year = year; this.price = price;
        this.hybrid = hybrid;
    }

    public String toString() {
        if (hybrid) {
            return "Brand: " + brand + ", Model: " + model + " Hybrid " + ", Year: " + year + ", Price: $" + price;
        } else {
            return "Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Price: $" + price;
        }

    }

}

class carObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("Bmw", "X5");

        Car car3 = new Car("Audi", "A8", 2019);

        Car car4 = new Car("Nissan", "Leaf", 2020, 25000);

        Car car5 = new Car("Honda", "Civic", 2015, 17000, true);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }


}
