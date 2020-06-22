package day48_Abstraction;

public class Test implements Interface_Intro, Interface_1, Interface_2{
    // interface cannot be extended, only can be implemented
    // we can more than 1 interfaces

    @Override
    public void method1(){

    }

    @Override
    public void method2(){

    }

    @Override
    public void method3() {

    }

    @Override // from Interface_1
    public int sum() {
        return 0;
    }

    @Override // from Interface_1
    public String print(){
        return "Printing";
    }

    @Override // from Interface_2
    public void method4(){

    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        System.out.println(obj1.name);

    }

    public void method8(){
        System.out.println("method8 is abstract method from Interface_2 ");
    }

}

