package myPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbaijan {
    /*
    in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
     */

    public static void main(String[] args) {
        Employee employee6 = new Employee();
        employee6.setEmployeeInfo("Nishit", 1127, 111111234, "Developer", 150000, 'M');

        Employee employee7 = new Employee();
        employee7.setEmployeeInfo("Dave", 1128, 111111123, "IT Support", 90000, 'M');


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee6);
        employees.add(employee7);

        employees.add(HumanResources.employee1);
        employees.add(HumanResources.employee2);

        System.out.println(employees.size()); // size of employee arraylist

        for(Employee each : employees){
            System.out.println(each);
        }



    }

}
