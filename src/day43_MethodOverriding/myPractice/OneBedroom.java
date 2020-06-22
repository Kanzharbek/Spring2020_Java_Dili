package day43_MethodOverriding.myPractice;

public class OneBedroom extends House {

    public OneBedroom(String houseType, int numberOfRooms, int numberOfBathrooms, int numberOfFloor) {
        this.houseType = houseType;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathroom = numberOfBathrooms;
        this.numberOfFloor = numberOfFloor;
    }

    public void greeting() {
        System.out.println("Welcome to One bedroom apartment");
    }

    public static void main(String[] args) {
        OneBedroom oneBed = new OneBedroom("Apartment ~ One Bedroom", 2, 1, 2);
        oneBed.greeting();
        System.out.println(oneBed);

    }
}
