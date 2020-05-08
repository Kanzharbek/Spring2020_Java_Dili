package day34_CustomClass;

import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Muhtar", 123, "Manual Tester", 110000);

        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTester(tester1);
        System.out.println(scrum.testersTeam.size());

        scrum.fireTester(123);
        System.out.println(scrum.testersTeam.size());





    }
}
