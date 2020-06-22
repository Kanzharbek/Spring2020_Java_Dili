package day48_Abstraction;
    /*
    Create an abstract class called Phone:
        attributes: brand, model, price, size
        abstract methods: calling(), texting()
        instance method: toString()
     */

public abstract class Phone {

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(String phoneNumber);

    public abstract void texting(String phoneNumber);

    public String toString() {
        return "Brand: " + brand + ", model: " + model + ", price: $" + price + ", size: " + size;
    }


}
