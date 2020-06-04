package day46_final_abstraction.Shape;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle obj1 = new Circle(5.3);
        System.out.println(obj1.radius);
        obj1.Area();

        Square obj2 = new Square(4);
        System.out.println(obj2.side);
        obj2.Area();

        Rectangle obj3 = new Rectangle(2, 5);
        System.out.println(obj3.width);
        System.out.println(obj3.length);
        obj3.Area();

    }
}
