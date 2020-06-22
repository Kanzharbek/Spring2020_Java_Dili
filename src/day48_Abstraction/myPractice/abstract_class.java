package day48_Abstraction.myPractice;

public abstract class abstract_class {
    public String name;
    public String grade;

    public abstract void printName();
    public abstract void printGrade();

    public  void greeting(){
        System.out.println("Hello from Abstract Class");
    }

    public void lunchTime(){
        System.out.println("It's lunch time");
    }

    public String toString(){
        return "Name: " + name + "\nGrade: " + grade;
    }
}
