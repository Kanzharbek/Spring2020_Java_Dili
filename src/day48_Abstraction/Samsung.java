package day48_Abstraction;

public class Samsung extends Phone {

    static {
        brand = "Samsung";
    }

    public Samsung(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(String phoneNumber) {
        System.out.println("calling: " + phoneNumber);
    }

    @Override
    public void texting(String phoneNumber) {
        System.out.println("texting: " + phoneNumber);
    }

    public void freezing(){
        System.out.println("Samsung is never freezing...");
    }

    public static void main(String[] args) {
        Samsung samsung1 = new Samsung("Galaxy S9", 980, "Large");
        System.out.println(samsung1);
        samsung1.calling("Ali");
        samsung1.texting("friends");

    }
}
