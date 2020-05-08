package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developer> devpTeam = new ArrayList<>();

    public void hireTester(Tester tester) {
        testersTeam.add(tester);
    }

    public void fireTester(long id){
        testersTeam.removeIf(p -> p.employeeID == id);
    }

    public void hireDeveloper(Developer developer){
        devpTeam.add(developer);
    }

    public void fireDeveloper(long id){
        devpTeam.removeIf(eachDev -> eachDev.employeeID==id);
    }

}

