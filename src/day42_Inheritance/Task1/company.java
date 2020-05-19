package day42_Inheritance.Task1;

public class company {
    /*
    create a class called company:
					create 3 objects of employee and set their info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
     */

    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static {
        employee1 = new Employee();
        employee1.setEmployeeInfo("Dilnaz", 28, 'F', 120000, 1124, "SDET");

        employee2 = new Employee();
        employee2.setEmployeeInfo("Kanjar", 31, 'M', 150000, 2828, "QA Tester");

        employee3 = new Employee();
        employee3.setEmployeeInfo("Ali", 1, 'M', 200000, 1919, "Developer");
    }

    public static void main(String[] args) {

        Employee[] employees = {employee1, employee2, employee3}; // objects in Array
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Name: " + employees[i].name + ", Employee ID: " + employees[i].employeeID);
        }


    }

}
