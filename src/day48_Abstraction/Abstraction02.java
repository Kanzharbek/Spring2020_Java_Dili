package day48_Abstraction;

interface A1{
    void method1();// by default: public
}

interface B1 {
    abstract int method2(); // by default: public
}

interface C1 {
    public abstract void method3();
}

public class Abstraction02 implements A1, B1, C1 {

    public void method1(){

    }

    public int method2(){
        return 0;
    }

    public void method3(){

    }
}
