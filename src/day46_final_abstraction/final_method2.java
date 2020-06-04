package day46_final_abstraction;

class Test{
    public final void method1(){
        System.out.println("A");
    }
}

public class final_method2 extends Test{

    /* cannot override final method
    @Override
    public final void method1(){
    System.out.println("B");
    }
     */

}
