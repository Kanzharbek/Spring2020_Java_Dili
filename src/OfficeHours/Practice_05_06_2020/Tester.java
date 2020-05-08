package OfficeHours.Practice_05_06_2020;

public class Tester {

    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setInfo(String name, String jobTitle, double salary, long employeeID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public String toString() {
        return "Name: " + name + ", Job title: " + jobTitle + ", Salary: $" + salary + ", Employee ID: " + employeeID;
    }

    public void smokeTest(){
        System.out.println(this.name+" is doing smoke test.");
    }

    public void creatingTicket(){
        System.out.println(this.name+" is creating a ticket on Jira.");
    }

}
