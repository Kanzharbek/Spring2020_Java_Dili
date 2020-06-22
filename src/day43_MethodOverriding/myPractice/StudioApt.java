package day43_MethodOverriding.myPractice;

public class StudioApt extends House {

    public StudioApt(String houseType, int numberOfRooms, int numberOfBathrooms, int numberOfFloor) {
        this.houseType = houseType;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathroom = numberOfBathrooms;
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public void greetings() {
        System.out.println("Welcome to Studio Apartment");
    }

    public static void main(String[] args) {

        StudioApt studio1 = new StudioApt("Apartment ~ studio", 1, 1, 2);
        studio1.greetings();
        System.out.println(studio1);
    }


}
