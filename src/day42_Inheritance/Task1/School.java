package day42_Inheritance.Task1;

public class School {
    /*
    create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
     */
    public static void main(String[] args) {
        Student student1 = new Student(); // object Student
        student1.setStudentInfo("Dilnaz", 28, 'F', 1124, "Math");
        System.out.println(student1); // toString from Student class
        student1.attendClass(); // method from Student class
        student1.code(); // method from Student class
        student1.drink("coffee"); // method is coming from Person class to Student class to School
        student1.eat("sushi"); // method is coming from Person class to Student class to School
        student1.sleep(); // method is coming from Person class to Student class to School
        student1.walk("park"); // method is coming from Person class to Student class to School

        Student student2 = new Student();
        student2.setStudentInfo("Kanjar", 31, 'M', 2828, "Java");
        System.out.println(student2);// toString from Student class
        student2.attendClass(); // method from Student class
        student2.code(); // method from Student class
        student2.drink("coffee"); // method is coming from Person class to Student class to School
        student2.eat("sushi"); // method is coming from Person class to Student class to School
        student2.sleep(); // method is coming from Person class to Student class to School
        student2.walk("park"); // method is coming from Person class to Student class to School


    }
}
