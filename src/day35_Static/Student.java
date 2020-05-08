package day35_Static;

public class Student {
    String name;
    String id;
    double gpa;

    static String school = "Cybertek";

    public void setInfo(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public static void printSchoolName() {
        System.out.println("School name is: " + school);
    }

    public String toString() {
        return "Student name: " + name + ", School name is: " + school + ", ID: " + id + ", GPA: " + gpa;
    }
}
