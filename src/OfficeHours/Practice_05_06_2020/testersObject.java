package OfficeHours.Practice_05_06_2020;

public class testersObject {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.name = "Kanjar";
        tester1.jobTitle = "SDET";
        tester1.salary = 115000;
        tester1.employeeID = 2828;
        System.out.println(tester1);

        Tester tester2 = new Tester();
        tester2.setInfo("Dilnaz", "Junior SDET", 100000, 1124);
        System.out.println(tester2);

        Tester tester3 = new Tester();
        tester3.setInfo("Ali", "Manual tester", 90000, 1919);
        System.out.println(tester3);

        tester1.smokeTest();
        tester2.creatingTicket();
        tester3.creatingTicket();

    }
}
