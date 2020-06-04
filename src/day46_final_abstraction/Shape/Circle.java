package day46_final_abstraction.Shape;

public final class Circle extends Shape { // Circle is final, means cannot be inherited(be a parent class)

    public double radius;
    public final static double PI = 3.14; // final

    @Override
    public void Area() { // overridden abstract method
        double area = radius * radius * PI;
        System.out.println("Area of Circle is: " + area);
    }

    public Circle(double radius) { // constructor
        this.radius = radius;
    }
}
