package day35_Static;

public class studentObject {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Dilnaz", "12345", 3.5);
        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Kanjar", "1122", 4.0);
        System.out.println(student2);

        Student.printSchoolName(); // calling static method inside static method


    }
}
