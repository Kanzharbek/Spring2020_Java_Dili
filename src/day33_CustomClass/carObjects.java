package day33_CustomClass;

public class carObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.Brand = "BMW";
        car1.model = "X5";
        car1.color = "blue";
        car1.year = 2020;

        System.out.println(car1.Brand);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);

        car1.start();
        car1.drive();
        car1.getCarInfo();

        Car car2 = new Car();
        car2.Brand = "Toyota";
        car2.model = "Corola";
        car2.color = "Black";
        car2.year = 2019;

        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);

        car2.start();
        car2.drive();
        car2.getCarInfo();

        Car car3 = new Car();
        car3.Brand = "Mercedes";
        car3.model = "C Class";
        car3.color = "Silver";
        car3.year = 2020;

        car3.start();
        car3.drive();
        car3.getCarInfo();

        Car car4 = new Car();
        car4.Brand = "Tesla";
        car4.model = "Model X";
        car4.color = "White";
        car4.year = 2019;

        Car car5 = new Car();
        car5.Brand = "Mini Cooper";
        car5.model = "countryman";
        car5.color = "Ivory";
        car5.year = 2019;

        System.out.println("=========================================");

        Car[] cars = {car1, car2, car3, car4, car5};

        /*
        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();
        */
        System.out.println("with For Each Loop:\n");

        for(Car each : cars){
            each.getCarInfo();
        }

        System.out.println("\nwith For Loop:\n");

        for(int i = 0; i < cars.length; i++){
            cars[i].getCarInfo();
        }

        System.out.println("===================================");




    }
}
