package OfficeHours.Saim_05_09_2020;

public class BestBuy {

    String location;
    int numberOfEmployees;
    String phoneNumber;
    static int numberOfComputers;

    public void close(){
        System.out.println("This Best Buy is closed");
    }
    public static void closeAll(){
        System.out.println("All Best Buy stores are closing");
    }

}
