package OfficeHours.Practice_05_13_2020;

public class Student {
    String name;
    long id;
    static String schoolName = "Cybertek";

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", School Name: " + schoolName;
    }

    public static void printSchoolName() {
        System.out.println(schoolName + " School");
    }

}

class studentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Madina";
        student1.id = 123;
        student1.schoolName = "Harvard"; // changes to Harvard for all objects

        Student student2 = new Student();
        student2.name = "Emrah";
        student2.id = 456;

        System.out.println(student1.name);
        System.out.println(student2.name);

        System.out.println(student1.id);
        System.out.println(student2.id);

        System.out.println(student1);
        System.out.println(student2);


    }
}
