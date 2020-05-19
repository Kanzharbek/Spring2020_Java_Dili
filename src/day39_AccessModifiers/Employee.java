package day39_AccessModifiers;

public class Employee {
    /*
    create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
     */

    String name;
    String jobTitle;
    long id;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, long id) {
        this(name, jobTitle);
        this.id = id;
    }

    public Employee(String name, String jobTitle, long id, double salary) {
        this(name, jobTitle, id);
        this.salary = salary;
    }

    public String toString() {
        return "====================" + "\nName: " + name + "\nJob title: " + jobTitle + "\nID: " + id + "\nSalary: " + salary;
    }

}

class Employees {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Dilnaz");

        Employee employee2 = new Employee("Kanjar", "SDET");

        Employee employee3 = new Employee("Jazira", "BA", 123);

        Employee employee4 = new Employee("Muhtar", "Teacher", 1111, 150000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);


    }
}