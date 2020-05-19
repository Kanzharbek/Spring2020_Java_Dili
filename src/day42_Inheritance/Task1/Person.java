package day42_Inheritance.Task1;

public class Person {
    /*
    create a class called Person
				attributes:  name, age, gender
				methods: eat, walk, sleep, setPersonInfo
     */
    public String name;
    public int age;
    public char gender;

    public void setPersonInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food) { // instance method
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {  // instance method
        System.out.println(name + " is drinking " + drink);
    }

    public void walk(String place) { // instance method
        System.out.println(name + " is walking at the " + place);
    }

    public void sleep() { // instance method
        System.out.println(name + " is sleeping");
    }
}

class Employee extends Person {
    /*
    create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString

    name - inherited
    age - inherited
    gender - inherited

    Salary - declared
    EmployeeID - declared
    jobTitle - declared

    setPersonInfo - inherited
    eat - inherited
    sleep - inherited
    walk - inherited
    drink - inherited

    setEmployeeInfo - declared
    work - declared
    toString - declared
     */
    public double salary;
    public long employeeID;
    public String jobTitle;

    public void setEmployeeInfo(String name, int age, char gender, double salary, long employeeID, String jobTitle) {
        setPersonInfo(name, age, gender); // setPersonInfo() --> came form Person class which accepts name, age, gender and initialize them
        this.salary = salary;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Name: " + name + ", Job title: " + jobTitle + ", Employee ID: " + employeeID + ", Salary: " + salary + ", Gender: " + gender;
    }
}

class Student extends Person {
    /*
    create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString

	name - inherited
    age - inherited
    gender - inherited

    studentID - declared
    class - declared

    setPersonInfo - inherited
    eat - inherited
    sleep - inherited
    walk - inherited
    drink - inherited

    attendClass() - declared
    code() - declared
    setStudentInfo() - declared
    toString() - declared
     */
    public long studentID;
    public String clas;

    public void setStudentInfo(String name, int age, char gender, long studentID, String clas) {
        setPersonInfo(name, age, gender); // setPersonInfo() --> came form Person class which accepts name, age, gender and initialize them
        this.studentID = studentID;
        this.clas = clas;
    }

    public void attendClass() { // instance method
        System.out.println(name + " is attending " + clas);
    }

    public void code() { // instance method
        System.out.println(name + " is coding");
    }

    public String toString() {
        return "Name: " + name + ", Student ID: " + studentID;
    }
}



