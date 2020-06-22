package day40_Encapsulation;

public class Encapsulation {

    private long SSN; // private instance var accessible only inside the class

    //getter --> returns a data, read only.
    public long getSSN() { // access-modifier must be public to access from another packages and classes
        return SSN;
    }

    //setter --> write only, to set a data to a private var
    public void setSSN(long SSN) { // access-modifier must be public to access from another packages and classes
        this.SSN = SSN;
    }

}

class Test {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //  System.out.println(obj.SSN); // no direct access to ssn variable. It's private data
        System.out.println(obj.getSSN()); // getter: will print private data

        obj.setSSN(112211); // setting a private data for ssn variable
        System.out.println(obj.getSSN());
    }
}