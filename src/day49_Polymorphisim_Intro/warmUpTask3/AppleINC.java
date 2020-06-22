package day49_Polymorphisim_Intro.warmUpTask3;

public class AppleINC {
    public static void main(String[] args) {
    /*
    6. create a class named AppleInc:
            create 2 Tester' and 3 Developer' objects
            create a list of ScrumTeam and store all Tester's and Developer's objects
            Iterator the list of scrum team to display the information of the full time employees
     */
        ScrumTeam tester1 = new Tester("Jazi", 123, 70_000, 001100, "BA", true, true);
        ScrumTeam tester2 = new Tester("Kan", 124, 110_000, 112211, "SDET", false, true);

        ScrumTeam dev1 = new Developer("Mike", 333, 150_000, 3434, "Front-End Developer", true, true);
        ScrumTeam dev2 = new Developer("Emily", 444, 85_000, 6666, "Marketing Manager", true, false);

        ScrumTeam[] team1 = {tester1, tester2, dev1, dev2};
        for (ScrumTeam each:team1) {
            System.out.println(each);
        }
    }
}
