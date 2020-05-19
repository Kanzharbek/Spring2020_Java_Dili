package day37_Constructor;

public class q12 {
    static String name = "Aaron";

    public static void main(String[] args) {
        System.out.println("Daniel");
    }

    public static void print(String str) {
        System.out.println(str);
    }

    static { // this will print first
        print(name); // print is a method with parameter String
                    // name is static var
    }
}
