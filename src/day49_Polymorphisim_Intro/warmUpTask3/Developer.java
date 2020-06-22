package day49_Polymorphisim_Intro.warmUpTask3;

public final class Developer extends Employees implements ScrumTeam, WorkRemotely {
    /*
    5. create a final class named Developer that can inherit Employees, ScrumTeam, and WorkRemotely
            set a constructor that can initialize fields (instance variables)
     */
    public Developer(String employeeName, int employeeID, double salary, int ssn, String jobTitle, boolean isFullTime, boolean hasPTO){
        setEmployeeName(employeeName);
        setEmployeeID(employeeID);
        setSalary(salary);
        setSsn(ssn);
        setJobTitle(jobTitle);
        setFullTime(isFullTime);
        setHasPTO(hasPTO);
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
