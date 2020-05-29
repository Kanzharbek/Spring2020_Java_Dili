package OfficeHours.Practice_05_27_2020;

public class MethodOverloading {

    public void method(){

    }

    private String method(int a){ // method overloading, parameter must be different than original one
        return "123"; // return type must match with return data
    }

    public static void method2(){

    }

    public static int method2(int a){
        return 123;
    }

    public MethodOverloading(){ // contractor

    }

    public MethodOverloading(int a){ // overloading contractor

    }

    public MethodOverloading(int a, int b){

    }

    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(int a) { // overloading the main method with dif parameter
        System.out.println("int");
    }
}
