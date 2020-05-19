package day40_Encapsulation;

public class EmployeeInfo {

    private double salary;
    private long SSN;
    private String Address;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

class BankOfAmerica{
    public static void main(String[] args) {

        EmployeeInfo Dilnaz = new EmployeeInfo();

        Dilnaz.setAddress("Bay Area");
        System.out.println(Dilnaz.getAddress());


    }
}
