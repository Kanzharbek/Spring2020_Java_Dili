package day49_Polymorphisim_Intro;

interface A {
    void readBooks();
    abstract void watchTV();
}

abstract class B implements A {
    @Override // after overriding it's not abstract method anymore
    public void readBooks(){
        System.out.println("Reading books");
    }
}
public class quiz7 extends B {

    @Override
    public void watchTV(){
        System.out.println();
    }
}
