package day42_Inheritance.Task2;

public class Device {
    /*
    attributes: brand, model, price, country
				methods: toString
     */
    public String brand;
    public String model;
    public double price;
    public String country;
    public String type;
    public String size;

    public void setDevice(String brand, String model, double price, String type, String size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.type = type;
        this.size = size;
    }

    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Type: " + type + ", Size: " + size + ", Price: $" + price + ", Made in " + country;
    }

}

class Phone extends Device {
    /*
 create ba class called phone:
                attributes: brand, model, price, country, type = "Phone"
                methods: call, text,  toString

     brand, (Inherited)
     model, (Inherited)
     price,  (Inherited)
     country,  (Inherited)
     type = "Phone" , (Inherited)
     size (Inherited)

     setDevice ()(Inherited)

     call ()
     text,  ()
     toString (Inherited)
     */

    public Phone(String brand, String model, double price, String size) {
        setDevice(brand, model, price, "Phone", size);
    }

    public void call(long number) {
        System.out.println("Calling the number: " + number);
    }

    public void text(long number) {
        System.out.println("texting to: " + number);
    }
}

class TV extends Device {
    /*
    brand, (Inherited)
    model,  (Inherited)
    price,   (Inherited)
    country,   (Inherited)
    Type  (Inherited)
    size (Inherited)

    setDevice() (Inherited)
    watch,
    toString  (Inherited)
     */
    public TV(String brand, String model, double price, String size) {
        setDevice(brand, model, price, "TV", size);
    }

    public void watch() {
        System.out.println("I am watching " + brand + " " + model + " " + type + " that cost me $" + price + " from " + country);
    }
}
