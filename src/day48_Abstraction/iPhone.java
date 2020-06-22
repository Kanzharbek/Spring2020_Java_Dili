package day48_Abstraction;

public class iPhone extends Phone {

    static {
        brand = "iPhone";
    }

    public iPhone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public void calling(String phoneNumber) {
        System.out.println("calling: " + phoneNumber);
    }

    public void texting(String phoneNumber) {
        System.out.println("texting: " + phoneNumber);
    }

    public void faceTiming(String phoneNumber) {
        System.out.println("facetiming with: " + phoneNumber);
    }

    public static void main(String[] args) {
        iPhone iphone1 = new iPhone("11 PRO", 1250, "Plus");
        System.out.println(iphone1);
        iphone1.calling("Hubby");
        iphone1.texting("7077574707");
        iphone1.faceTiming("Son");

        iPhone iphone2 = new iPhone("10", 1000, "Plus");
        iphone2.faceTiming("Mom");
        iphone2.texting("7077574707");
        iphone2.calling("911");


    }

}
