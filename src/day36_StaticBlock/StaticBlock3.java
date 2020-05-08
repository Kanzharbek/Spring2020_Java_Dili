package day36_StaticBlock;

public class StaticBlock3 {

    static String name;
    static int num;

    static { // can call through class name in other classes
        name = "Dilnaz";
        num = 7;
        System.out.println(name);
    }

    public static void main(String[] args) { // it will be executed only inside this main method
        name = "Muhtar";
        num = 200;
        System.out.println(name);
    }
}
