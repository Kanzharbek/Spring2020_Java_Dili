package OfficeHours.Practice_05_13_2020;

public class statics {

    int InstanceVar = 100;
    static int staticVar = 200;

    public static  void staticMethod(){ // static accepts only static variables
        //System.out.println(InstanceVar);
        System.out.println(staticVar);
    }

    public void instanceMethod(){ // instance method accepts instance and static var, methods
        staticMethod();
        System.out.println(staticVar);
        System.out.println(InstanceVar);
    }

    public static void main(String[] args) {

    }
}
