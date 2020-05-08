package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock2 {

    static int a; // static var
    static int b; // static var

    static Tester tester1 = new Tester(); // this student1 is usable everywhere. It's static now

    static { // static method, accepts only static vars
        a = 100;
        b = 200;

        if (100 > 200) { // if block can be only inside the block
            a = 100;
        } else {
            b = 200;
        }

        tester1.setInfo("Jean", 12345, "SDET", 120000);
    }

    public static void main(String[] args) {

    }


}
