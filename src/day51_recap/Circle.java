package day51_recap;

/*
create a final class named circle that can inherit from Shape and PI
            variable: radius
            set a static block that initialize the name to "Circle"
            set a constructor that can initialize the radius

 */
public final class Circle extends Shape implements PI {

    public double radius;

    public Circle(double radius) { // Constructor
        this.radius = radius;
        name = "Circle";
    }

    @Override // Overriding a method from Shape class
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override // Overriding a method from Shape class
    public double calculatePerimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return name + "{" + "radius=" + radius + '}';
    }
}
