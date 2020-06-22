package day48_Abstraction.myPractice;

public class TestClass extends abstract_class implements Interface1 {

    @Override // interface' method
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    @Override // interface' method
    public void division(int a, int b) {
        System.out.println(a / b);
    }

    @Override // interface' method
    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    @Override // interface' method
    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    @Override // abstract class method
    public void printName() {
        System.out.println(name);
    }

    @Override // abstract class method
    public void printGrade() {
        System.out.println(grade);
    }

    public static void main(String[] args) {
        TestClass obj1 = new TestClass();

        obj1.name = "Dilnaz";
        obj1.grade = "A";
        System.out.println(obj1);

        obj1.subtraction(4, 2);
        obj1.multiplication(4, 9);
        obj1.division(1, 4);
        obj1.sum(22, 66);

        obj1.printGrade();
        obj1.printName();

        obj1.greeting(); // instance method inherited from abstract class
        obj1.lunchTime(); // instance method inherited from abstract class
    }
}
