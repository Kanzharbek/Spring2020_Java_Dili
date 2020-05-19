package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    /*
    Create a class called Circle
            instance variables:
                    radius, pi, diameter

            add a constructor that can initialize the radius of the circle

            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
                  perimeter = diameter * PI
     */
    static double PI = 3.14;
    double radius;
    double diameter;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double perimeter() {
        return diameter * PI;
    }

    public double area() {
        return PI * radius * radius;
    }

    public String toString() {
        return "Circle radius: " + radius + ", Circles diameter: " + diameter + ", Circles area: " + area()
                + ", Circles perimeter: " + perimeter();
    }
}

class CircleObject {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r = scan.nextDouble();

        Circle circle1 = new Circle(r);

        System.out.println("Area of circle is: " + df.format(circle1.area()));
        System.out.println("Diameter of circle is: " + circle1.diameter);
        System.out.println("Perimeter of circle is: " + df.format(circle1.perimeter()));
        System.out.println(circle1);
    }

}
