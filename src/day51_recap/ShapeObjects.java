package day51_recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        Cylinder cylinder1 = new Cylinder(3, 5);
        Cylinder cylinder2 = new Cylinder(3, 5);

        ArrayList<Circle> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(circle1, circle2));

        ArrayList<Cylinder> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(cylinder1, cylinder2));

        ArrayList<Shape> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(circle1, circle2, cylinder1, cylinder2));

        //Shape shape1 = circle1; // upcasting
        //Shape shape2 = new Cylinder(3, 5);
        //Shape shape3 = (Circle)shape2; // down casting

        for (Shape each : list3) {
            System.out.println(each.name + " : " + each.calculateArea());
        }










    }
}
