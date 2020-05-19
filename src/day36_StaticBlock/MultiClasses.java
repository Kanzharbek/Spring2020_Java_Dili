package day36_StaticBlock;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day35_Static.Dog;
import day37_Constructor.Employee;
import org.w3c.dom.ls.LSOutput;

/*
        can have ONLY 1 public class
        public class' name MUST match with file name
        position of classes does not matter
    */
class Tester { // Access-modifier: default
    String name;
    int age;

    public void setInfo(String name, int age){
       name = name;
        age = age;
    }

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
        Tester emp1 = new Tester();
        emp1.setInfo("Ali", 1);
        System.out.println(emp1.name);
        System.out.println(emp1.age);

        System.out.println("public class");
    }



}
