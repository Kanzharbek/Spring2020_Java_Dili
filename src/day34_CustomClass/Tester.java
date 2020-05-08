package day34_CustomClass;

public class Tester {

    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String Name, long EmployeeID, String JobTitle, double Salary){
        name = Name;
        employeeID = EmployeeID;
        jobTitle = JobTitle;
        salary = Salary;
    }

    public String toString(){
        return "Name: "+name+", job Title: "+jobTitle
                +", employee id: "+employeeID+", salary: "+salary;
    }

}
