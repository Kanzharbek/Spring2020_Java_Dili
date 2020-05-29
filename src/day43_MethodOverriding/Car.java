package day43_MethodOverriding;

public class Car {

    void Start() {
        System.out.println("Insert the key");
        System.out.println("Twist ignition key to start");
    }
}

class Tesla extends Car {

    void Start() {
        System.out.println("Push the button to start");
    }
}

class Honda extends Car {

}

class Jeep extends Car {

    void Start() {
        System.out.println("Call mechanic \nOil change \nJump Start");
    }
}

class BMW extends Car {

    void Start() {
        System.out.println("Call some friends \nTell them to push \nRemove clutch peddle suddenly");
    }
}
