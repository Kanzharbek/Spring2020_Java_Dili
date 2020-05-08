package day33_CustomClass;

public class CellPhone {

    String brand;
    String model;
    String color;
    int year;

    public void getInfo() {
        System.out.println(year + " " + brand +" " + model + " " + color);
    }

    public void myPhone() {
        System.out.println("I'm using: " + brand + " " + model + " of: " + year + " " + color+ " color.");
    }


}
