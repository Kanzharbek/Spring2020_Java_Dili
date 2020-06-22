package day51_recap;

/*
        create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
 */
public abstract class Shape {

    public String name; // instance var

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
