package day43_MethodOverriding.myPractice;

public class House {

    public String houseType;
    public int numberOfRooms;
    public int numberOfFloor;
    public int numberOfBathroom;

    public void greetings() {
        System.out.println("Welcome to our house!!!");
    }

    public String toString() {
        return "House type: " + houseType + "\nNumber of rooms: " + numberOfRooms + "\nNumber of bathrooms: " +
                numberOfBathroom + "\nNumber of Floor: " + numberOfFloor;
    }
}
