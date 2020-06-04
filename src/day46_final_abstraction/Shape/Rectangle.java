package day46_final_abstraction.Shape;

public class Rectangle extends Shape {

    public double width;
    public double length;

    public void Area() {
        double area = width * length;
        System.out.println("Area of Rectangle is: " + area);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
