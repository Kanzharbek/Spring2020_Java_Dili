package day48_Abstraction.warmUp;

public interface Downloadable {
    boolean downloadable = true;

    void download();
}

interface AndroidApps extends Downloadable {
    String AppStoreName = "Android App Store";
}

interface AppleApps extends Downloadable {
    String AppStoreName = "Apple Store";
}

abstract class Phone {
    public String brand;
    public String model;
    public double price;
    public int size;

    public abstract void texting();
    public abstract void calling();
}

class iPhone extends Phone implements AppleApps {

    public iPhone(String brand, String model, double price, int size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public void faceTiming(String name){ // instance method
        System.out.println("iPhone is facetiming with " + name);
    }

    public void selfie(){ // instance method
        System.out.println("iPhone makes great selfies");
    }

    @Override
    public void texting() { // overriding method from Phone abstract class
        System.out.println("iPhone is texting...");
    }

    @Override
    public void calling(){ // overriding method from Phone abstract class
        System.out.println("iPhone is calling...");
    }

    @Override
    public void download() { // Overriding method from Downloadable interface
        System.out.println("iPhone is downloading apps from " + AppStoreName);
    }
}

class Nokia extends Phone implements AndroidApps {

    public Nokia(String brand, String model, double price, int size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }


    public void freezing(){
        System.out.println("Nokia is freezing");
    }

    @Override // overriding method from Phone abstract class
    public void download() {
        System.out.println("Nokia downloads apps from " + AppStoreName);
    }

    @Override // overriding method from Phone abstract class
    public void texting() {
        System.out.println("Nokia is texting...");
    }

    @Override // overriding method from Phone abstract class
    public void calling() {
        System.out.println("Nokia is calling...");
    }
}


