package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        System.out.println(obj.getSSN());
        obj.setSSN(1124);
        System.out.println(obj.getSSN());

    }
}
