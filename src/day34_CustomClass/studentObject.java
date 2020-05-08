package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class studentObject {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Adam", "England", 34, 3.5, 'M', true);

        Student student2 = new Student();
        student2.setInfo("Mike", "German", 30, 3.0, 'M', false);

        Student student3 = new Student();
        student3.setInfo("Johny Guitar", "US", 40, 2.5, 'M', false);

        Student student4 = new Student();
        student4.setInfo("Anna", "Ukrainian", 33, 3.9, 'F', true);

        Student[] students = {student1, student2, student3, student4}; // Array

        ArrayList<Student> canGrad = new ArrayList<>(Arrays.asList(students)); // ArrayList, contains Array's elements
        canGrad.removeIf(p -> p.gpa <= 3.0);

        System.out.println(canGrad.size());

        for (int i = 0; i < canGrad.size(); i++) {
            Student each = canGrad.get(i);
            System.out.println(each.name + " can graduate");
        }

        System.out.println("------------------------------------------------");

        ArrayList<Student> canNotGrad = new ArrayList<>(Arrays.asList(students));
        canNotGrad.removeIf(p -> p.gpa < 3.0);

        for (Student each : canNotGrad) {
            Student eachStudent = each;
            System.out.println(eachStudent.name + " cannot graduate");
        }


    }
}
