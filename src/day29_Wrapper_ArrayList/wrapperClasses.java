package day29_Wrapper_ArrayList;

public class wrapperClasses {

    public static void main(String[] args) {

        int a = 100; // primitive
        Integer b = a;

        short s1 = 200;
        int n1 = s1; // short can be assigned to int

        //  Integer N1 = s1; // Integer cannot accept other than int. Integer is dedicated only to int
        Integer N2 = n1; // Integer taking int value

        int a1 = 20;
        float f1 = a1;

        //  Float f2 = a1; // Float is dedicated only to float

        Integer I1 = 200;
        int i1 = I1; // primitives can take Wrapper class

        Byte B1 = 126;
        int a2 = B1; // primitives can take Wrapper class
        System.out.println(a2);




    }
}
