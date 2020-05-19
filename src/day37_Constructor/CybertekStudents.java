package day37_Constructor;

public class CybertekStudents {

    static String schoolName;
    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch){
        schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString(){
        return "Name: "+studentName+", Batch: " + batch + ", in group: " + groupNumber+". School name is: " + schoolName;
    }
}

class CObjects{ // Cybertek objects

    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Dilnaz", 1, "Batch18");
        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents("Kanjar", 40, "Batch11");
        System.out.println(student2);
    }
}
