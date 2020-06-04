package day46_final_abstraction;

public class final_encapsulation {

    final private int data1 = 200;
    private int data2 = 300;

    public int getData1() {
        return data1;
    }
    /* cannot set a value to "final" variable
    public void setData1(int data1) {
        this.data1 = data1;
    }
     */

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }
}
