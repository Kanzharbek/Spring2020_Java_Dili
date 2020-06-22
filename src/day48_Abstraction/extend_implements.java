package day48_Abstraction;

interface I1 {
    void method1(); // by default: public abstract method
}

interface I2 extends I1 { // interface can extend another interface. Now it has 2 methods
    void method2(); // by default: public abstract method
}

abstract class AC1 implements I2 { // class can ONLY IMPLEMENT interface.
    // AC1 has 3 abstract methods after implementing. It's not mandatory to override them because class is abstract class
    abstract void method3();
}

abstract class AC extends extend_implements { // class can extend another class
    abstract void method4();
}

public class extend_implements extends AC1 {
    // class can ONLY IMPLEMENT interface
    // MUST override all abstract methods

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}


