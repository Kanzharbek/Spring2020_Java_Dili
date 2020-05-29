package day43_MethodOverriding;

public class Shape {

    public double area;
    public double perimeter;

    public void calculateArea() {
        System.out.println("Area of the shape: " + area);
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter of the shape: " + perimeter);
    }
}

class Circle extends Shape {
    // inherited area, perimeter
    // methods: calculateAre(), calculatePerimeter()
    public double radius;
    public double PI = 3.14;

    @Override
    public void calculateArea() {
        area = radius * radius * PI;
        System.out.println("Area of the circle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = radius * 2 * PI;
        System.out.println("Perimeter of the circle: " + perimeter);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    // inherited area, perimeter
    // methods: calculateAre(), calculatePerimeter()
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = width * length;
        System.out.println("Area of the rectangle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = (width + length) * 2;
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

class Square extends Shape {
    // inherited area, perimeter
    // methods: calculateAre(), calculatePerimeter()
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        area = side * side;
        System.out.println("Area of the square: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * side;
        System.out.println("Perimeter of the square: " + perimeter);
    }
}