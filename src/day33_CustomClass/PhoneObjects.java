package day33_CustomClass;

public class PhoneObjects {

    public static void main(String[] args) {

        CellPhone apple = new CellPhone();
        apple.brand = "Apple";
        apple.model = "iPhone 10";
        apple.color = "Midnight Black";
        apple.year = 2019;

        apple.getInfo();
        apple.myPhone();

        System.out.println("==========================================");

        CellPhone galaxy = new CellPhone();
        galaxy.brand = "Samsung";
        galaxy.model = "Galaxy S9";
        galaxy.color = "purple";
        galaxy.year = 2018;

        galaxy.getInfo();
        galaxy.myPhone();

        System.out.println("==========================================");

        CellPhone[] phones = {apple, galaxy};

        for(CellPhone each : phones){
            each.getInfo();
        }
    }
}
