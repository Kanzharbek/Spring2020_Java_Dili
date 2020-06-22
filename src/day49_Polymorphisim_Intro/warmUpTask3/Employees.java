package day49_Polymorphisim_Intro.warmUpTask3;

public abstract class Employees {
    /*
    1. create an abstract class named Employees
            private variables: employeeName, employeeId, salary, ssn, JobtiTle, isFullTime, hasPTO
            encapsulate all private variables
            abstract methods: work(), meeting()
            instance Methods: toString()
     */
    private String employeeName;
    private int employeeID;
    private double salary;
    private int ssn;
    private String jobTitle;
    private boolean isFullTime;
    private boolean hasPTO;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public boolean isHasPTO() {
        return hasPTO;
    }

    public void setHasPTO(boolean hasPTO) {
        this.hasPTO = hasPTO;
    }

    public void work(){
        System.out.println(getEmployeeName() + " is working");
    }

    public void meeting(){
        System.out.println(getEmployeeName() + " has a meeting");
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                ", ssn=" + ssn +
                ", jobTitle='" + jobTitle + '\'' +
                ", isFullTime=" + isFullTime +
                ", hasPTO=" + hasPTO +
                '}';
    }
}


