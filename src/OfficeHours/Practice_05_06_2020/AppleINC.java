package OfficeHours.Practice_05_06_2020;

public class AppleINC {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Onur", "Junior Tester", 75000, 1234);

        Tester tester2 = new Tester();
        tester2.setInfo("Elton John", "Junior Tester", 75000, 1245);

        Tester tester3 = new Tester();
        tester3.setInfo("Rahman", "SDET", 120000, 2277);

        ScrumTeam scrum1 = new ScrumTeam(); // we can use ArrayLists in ScrumTeam class
        scrum1.hireTester(tester3);
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);

        scrum1.fireTester(1245);

        for (Tester each : scrum1.testersTeam) {
            // scrum1.testersTeam: returns the testersTeam ArrayList from ScrumTeam class
            System.out.println(each); // prints all testers from ScrumTeam
        }


        Developer dev1 = new Developer();
        dev1.setInfo("Barzy", "Senior Developer", 220200, 1122337);

        Developer dev2 = new Developer();
        dev2.setInfo("Emrah", "Usta Developer", 100000, 223232);

        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);

        //scrum1.fireDeveloper(1122337);

        System.out.println(scrum1.devpTeam.size()); // size of devTeam ArrayList

        for (Developer each : scrum1.devpTeam) {
            System.out.println(each);
        }

        System.out.println("--------------------------------------------------");

        System.out.println("In my Scrum team we have " + scrum1.testersTeam.size() + " testers and " + scrum1.devpTeam.size() + " developers");


    }

}
