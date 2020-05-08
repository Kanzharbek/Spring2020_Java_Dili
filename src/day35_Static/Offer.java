package day35_Static;

public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setInfo(String location, String company, double salary, boolean isFullTime){
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString(){
        return "Location: " + location + ", Company: " + company + ", Salary is: $" + salary + ", Full time: " + isFullTime;
    }
}
