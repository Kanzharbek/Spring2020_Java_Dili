package day49_Polymorphisim_Intro.warmUpTask;

public final class iPhone extends Phone implements AppleApps {
    static {
        brand = "Apple";
    }

    public iPhone(String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming with " + phoneNumber);
    }

    public void selfie(){
        System.out.println(model+ " takes a great selfie");
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting " + phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling " + phoneNumber);
    }

    @Override
    public void download() {
        System.out.println("iPhone is downloading apps" + AppStoreName);
    }


}
