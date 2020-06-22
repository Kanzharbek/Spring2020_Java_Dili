package day49_Polymorphisim_Intro.warmUpTask3;

public final class Tester extends Employees implements ScrumTeam, WorkRemotely {
    /*
    4. create a final class named Tester that can inherit Employees, ScrumTeam, and WorkRemotely
            actions: findingBug(), creatingTicket()

     */
    public Tester(String employeeName, int employeeID, double salary, int ssn, String jobTitle, boolean isFullTime, boolean hasPTO){
        setEmployeeName(employeeName);
        setEmployeeID(employeeID);
        setSalary(salary);
        setSsn(ssn);
        setJobTitle(jobTitle);
        setFullTime(isFullTime);
        setHasPTO(hasPTO);
    }

    public void findingBug(){
        System.out.println(getEmployeeName() + " is finding a bug");
    }

    public void creatingTicket(){
        System.out.println(getEmployeeName() + " is creating a ticket");
    }
    @Override
    public void dailyStandUp() {
        System.out.println(getEmployeeName() + " is on daily stand up meeting");
    }

    @Override
    public void workFromHome() {
        System.out.println(getEmployeeName() + " is working from home");
    }
}
