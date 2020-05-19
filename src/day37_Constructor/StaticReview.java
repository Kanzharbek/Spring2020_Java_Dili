package day37_Constructor;

public class StaticReview {

    static int a;
    int b;

    public static void main(String[] args) {
        StaticReview obj1 = new StaticReview();
        obj1.a = 20;
        obj1.b = 10;

        StaticReview obj2 = new StaticReview();
        obj2.a = 30; // a's value changed for both obj1 and obj2
        obj2.b = 50;

        System.out.println(obj1.a); // 30
        System.out.println(obj2.a); // 30

        System.out.println(obj1.b); // 10
        System.out.println(obj2.b); // 50


    }
}
