package day40_Encapsulation;

public class Person {

    private long SSN;
    private long id;
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSSN() {
        return SSN;
    }

    public long getId() {
        return id;
    }

}

class Person_objects {

    public static void main(String[] args) {

        Person person1 = new Person("Dilnaz"); //
        person1.setSSN(12345);
        person1.setId(1124);

        System.out.println("Name: " + person1.name);
        System.out.println("SSN: " + person1.getSSN());
        System.out.println("ID: " + person1.getId());

    }
}
