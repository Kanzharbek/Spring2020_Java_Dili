package day43_MethodOverriding;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        System.out.println(circle1.radius); // 3

        circle1.calculateArea();
        circle1.calculatePerimeter();

        System.out.println("=============================================");

        Rectangle rec1 = new Rectangle(3, 2);
        System.out.println(rec1.length); // 3
        System.out.println(rec1.width); // 2

        rec1.calculateArea();
        rec1.calculatePerimeter();

        System.out.println("==============================================");

        Square sq1 = new Square(4);
        System.out.println(sq1.side);

        sq1.calculateArea();
        sq1.calculatePerimeter();


    }
}
