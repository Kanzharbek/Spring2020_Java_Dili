package day41_Inheritance.Task1;

public class Employee {  // super class (parent)
    /*
        create  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
    */
    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString() {
        return "Name: " + name + ", Job Title: " + jobTitle + ", Salary: $" + salary + ", ID: " + id + ", Gender: " + gender;
    }
}

class Developer extends Employee {
    /*
	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     create a constructor that can initialize all the attributes of developer

    name(inherited)
    salary (inherited)
    id(inherited)
    jobTitle(inherited)
    gender(inherited)

    fixingBug() - declared
    coding() - declared

    toString() (inherited)
    */
    public Developer(double salary, String name, long id, String jobTitle, char gender) { // constructor
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public void fixingBug() { // instance method
        System.out.println(name + " is fixing a bug");
    }

    public void coding() { // instance method
        System.out.println(name + " is coding");
    }
}

class Tester extends Employee {
    /*
       create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			create a constructor that can initialize all the attributes of Tester

    name (Inherited)
    salary (Inherited)
    id (Inherited)
    jobTitle (Inherited)
    gender (Inherited)

    reporting()
    testing()
    toString()  (Inherited)
    */
    public Tester(double salary, String name, long id, String jobTitle, char gender) { // constructor
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public void reportingBug() { // instance method
        System.out.println(name + " is reporting a bug");
    }

    public void testing() { // instance method
        System.out.println(name + " is testing");
    }
}

class BusinessAnalyst extends Employee {
    /*
        create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writing Requirements, gathering, toString
     		create a constructor that can initialize all the attributes of businessAnalyst

    salary  (Inherited)
    name  (Inherited)
    id  (Inherited)
    jobTitle  (Inherited)
    gender  (Inherited)

    writingReq()
    gathering()
    toString() (Inherited)
     */
    public BusinessAnalyst(double salary, String name, long id, String jobTitle, char gender) { // constructor
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public void writingReq() { // instance method
        System.out.println(name + " is writing requirements");
    }

    public void gathering() { // instance method
        System.out.println(name + " is gathering requirements");
    }
}
