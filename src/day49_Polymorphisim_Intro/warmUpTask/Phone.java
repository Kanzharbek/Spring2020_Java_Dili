package day49_Polymorphisim_Intro.warmUpTask;

interface Downloadable {
    boolean downloadable = true; // by default: public static final

   public void download(); // by default: public abstract
}

interface AndroidApps extends Downloadable {
    String AppStoreName = "Android"; // by default: public static final
}

interface AppleApps extends Downloadable {
    String AppStoreName = "Apple"; // by default: public static final
}

public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;

     abstract void texting(long phoneNumber);

     abstract void calling(long phoneNumber);

    @Override
    public String toString() {
        return "Phone{" +
                "brand" + brand + '\'' +
                "model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

}
