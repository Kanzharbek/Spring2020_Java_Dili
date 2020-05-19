package day41_Inheritance.Task1;

public class EmployeeObjects {
    public static void main(String[] args) {

        Developer dev1 = new Developer(120000, "Namik", 123, "Software Developer", 'M');
        // dev1.reporting(); we cannot call reporting() method with dev object because it belongs to tester's object
        dev1.fixingBug();
        dev1.coding();
        System.out.println(dev1);

        Tester tester1 = new Tester(120005, "Hilal", 456, "QA", 'F');
        tester1.reportingBug();
        tester1.testing();
        System.out.println(tester1);

        BusinessAnalyst BA1 = new BusinessAnalyst(120002, "Ozgur", 789, "Business Analyst", 'F');
        BA1.writingReq();
        BA1.gathering();
        System.out.println(BA1);

    }
}
