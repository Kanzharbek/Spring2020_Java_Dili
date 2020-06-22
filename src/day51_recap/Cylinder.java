package day51_recap;

/*
create a final class named Cylinder that can inherit from Shape, Volume, and PI
            variables: radius, Height
 */
public final class Cylinder extends Shape implements PI, Volume {

    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        name = "Cylinder";
    }

    @Override // Shape
    public double calculateArea() {
        return (PI * 2 * radius * radius) + (height * PI * 2 * radius);
    }

    @Override // Shape
    public double calculatePerimeter() {
        return 2 * (PI * 2 * radius * height);
    }

    @Override // Volume
    public double calculateVolume() {
        return PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return name + "{" + "+ radius=" + radius + ", height=" + height + '}';
    }
}
