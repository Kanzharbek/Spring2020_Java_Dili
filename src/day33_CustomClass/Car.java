package day33_CustomClass;

public class Car {
    // custom class
    String Brand;
    String model;
    int year;
    String color;

    public void start() {
        System.out.println(Brand + " is started");
    }

    public void drive() {
        System.out.println("Driving " + Brand + " " + model);
    }

    public void getCarInfo() {
        System.out.println(year + " " + Brand + " " + model + " " + color);
    }

    public void setCarInfo(String carBrand, String carModel, String carColor, int carYear) {
        Brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
    }

    public String toString(){ // works as sout. need to specify this method in the class in order to use it
        String result = year + " " + Brand + " " + model + " " + color;
        return result;
    }

}
