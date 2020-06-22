package day49_Polymorphisim_Intro.warmUpTask2;

public interface OnlineEducation {
    //1. create an interface named onlineEducation
    //variable: boolean onlineStudent
    //abstract methods: attendClass();
    boolean onlineStudent = true; // by default: public, static, final

    void attendClass(); // by default: public and abstract method
}

interface Cybertek extends OnlineEducation {
    //2. create an interface named Cybertek that can inherit from OnlineEducation
    //variable: schoolName, requiresITBackGround
    String schoolName = "Cybertek";
    boolean requiresITBackground = false;
}

class Student implements OnlineEducation, Cybertek {
    //3. create an class named Student that can inherit from  onlineEducation and CybertekSchool
    //private variables: studentName, age, grade, has_ITBackGround
    //encapsulate all private variables
    //actions: studying(), takingBreaks(), toString()
    private String studentName;
    private int age;
    private String grade;
    private boolean has_ITBackground;

    public Student(String studentName, int age, String grade, boolean has_ITBackground){
       setStudentName(studentName);
       setGrade(grade);
       setHas_ITBackground(has_ITBackground);
       setAge(age);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public boolean isHas_ITBackground() {
        return has_ITBackground;
    }

    public void setHas_ITBackground(boolean has_ITBackground) {
        this.has_ITBackground = has_ITBackground;
    }

    public void studying() {
        System.out.println(getStudentName() + " is studying.");
    }

    public void takingBreak() {
        System.out.println(getStudentName() + " is taking a break.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", has_ITBackground=" + has_ITBackground +
                '}';
    }

    @Override
    public void attendClass() {

    }
}

class CybertekSchool {
    //    4. create a class named CybertekSchool
    //    create 5 objects of students and set your classmates' info
    //    create a list of Cybertek and store all student objects
    //    iterate the list to display the full information of students
    public static void main(String[] args) {

        Student student1 = new Student("John", 30, "A", true);
        Student student2 = new Student("Jazmine", 25, "B", false);
        Student student3 = new Student("Ali", 28, "A", true);

        student1.studying();
        student2.takingBreak();

        Cybertek[] students = {student1, student2, student3};
        for (Cybertek each : students) {
            System.out.println(each);
        }


    }
}
