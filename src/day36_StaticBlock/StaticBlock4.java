package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String name = "Dilnaz";

    static Tester tester1 = new Tester();
    //tester1.setInfo("Muhtar", 123, "SDET", 120000);

    int insVar;

    static {
        // gets executed as soon as the class is loaded
        // designed to initialize static vars
        name = "CyberTek School";

        tester1.setInfo("Muhtar", 123, "SDET", 120000);

        StaticBlock4 obj1 = new StaticBlock4();
        obj1.insVar = 300; // obj1 is 300
    }

    public static void main(String[] args) {
        name = "ALi";
        System.out.println(name);

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVar); // 0, because its different object
    }
}
