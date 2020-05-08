package day35_Static;

public class staticPractice2 {

    String brand;
    String model;
    static boolean hasWheels = true;

    public void printBrand() {
        System.out.println(brand);
    }

    public void printModel() {
        System.out.println(model);
    }

    public static void main(String[] args){
        System.out.println(hasWheels);
    }


}
