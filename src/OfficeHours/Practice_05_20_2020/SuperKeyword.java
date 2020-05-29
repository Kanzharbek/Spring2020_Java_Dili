package OfficeHours.Practice_05_20_2020;

class Data{
    int a  = 100;

    public void method(){
        System.out.println("Hello world!");
    }
}

public class SuperKeyword extends Data{
    int a  = 200;

    public void method(){
        System.out.println("hello Cybertek");
    }

    public SuperKeyword(){
        method(); // hello Cybertek
        super.method(); // Hello world! ==> method from super class
        System.out.println(super.a); // 100 ==> instance variable from super class
        System.out.println(a); // instance variable inside SuperKeyword class
    }

    public static void main(String[] args) {
        SuperKeyword obj = new SuperKeyword();
    }

}
