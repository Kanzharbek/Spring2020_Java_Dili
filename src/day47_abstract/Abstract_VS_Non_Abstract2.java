package day47_abstract;

abstract class A{

    public abstract void method1();
    public void method2(){};
}

abstract class B extends A{ // optional to override the method of A because class B is abstract as well as A

}

class C extends B{ // mandatory to override a method from A which was overridden in B, because B extends A
    public void method1(){ // method from class A which is extended by class B

    }
}

public class Abstract_VS_Non_Abstract2 extends A{ // mandatory to override the abstract method of A
    @Override // override method1() from A
    public void method1(){

    }
}
