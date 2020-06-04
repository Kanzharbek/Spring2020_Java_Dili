package day46_final_abstraction.Shape;

public class Square extends Shape {

    public double side;

    @Override
    public void Area() { // overridden abstract method from Shape class
        double area = side * side;
        System.out.println("Area of Square is: " + area);
    }

    public Square(double side) { // constructor
        this.side = side;
    }
}
