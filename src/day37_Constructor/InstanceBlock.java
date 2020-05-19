package day37_Constructor;

public class InstanceBlock {

    static { // static block
        System.out.println("static block"); // prints first
    }

    public static void main(String[] args) {
        InstanceBlock obj1 = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();
    }

    { // instance block
        System.out.println("instance block"); // depends on object. will be executed with every object
    }
}
