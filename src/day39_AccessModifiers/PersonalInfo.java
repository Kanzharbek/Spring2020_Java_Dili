package day39_AccessModifiers;

public class PersonalInfo {

    public static String name = "Dilnaz";
    public static char gender = 'F';

    private char grade = 'A'; // available only in this class
    private long ssn = 901234;
    private long id = 123456789;

    static int age = 28; // available only in this class and package
}

class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name: " + PersonalInfo.name);
        System.out.println("Gender: " + PersonalInfo.gender);
        // System.out.println("Grade: " + PersonalInfo.grade); grade: is not accessible, because it's private variable
        // System.out.println("SSN: " + PersonalInfo.ssn); ssn: is not accessible, because it's private variable
        // System.out.println("ID: " + PersonalInfo.id); id: is not accessible, because it's private variable

        System.out.println("Age: " + PersonalInfo.age); // age: static default
    }
}
