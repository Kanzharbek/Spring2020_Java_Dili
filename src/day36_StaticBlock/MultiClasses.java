package day36_StaticBlock;
    /*
        can have ONLY 1 public class
        public class' name MUST match with file name
        position of classes does not matter
    */
class Tester { // Access-modifier: default
    public static void main(String[] args) {
        System.out.println("Tester class");
    }
}

class Developer { // Access-modifier: default
    public static void main(String[] args) {
        System.out.println("Developer class");
    }
}

class ScrumTeam { // Access-modifier: default
    public static void main(String[] args) {
        System.out.println("ScrumTeam class");
    }
}

public class MultiClasses { // Access-modifier: public
    public static void main(String[] args) {
        System.out.println("public class");
    }


}
