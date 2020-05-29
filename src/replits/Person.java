package replits;

public class Person {
    private String firstname, lastname;
    private int age;

    public Person() {
        firstname = "undefined";
        lastname = "undefined";
        age = -1;
    }

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return firstname + " | " + lastname + " | " + age;
    }
}

class PersonObjects{
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.getAge());
        System.out.println(p1.getFirstname());
        System.out.println(p1.getLastname());

        System.out.println(p1);

        p1.setAge(7);
        p1.setFirstname("Dilnaz");
        p1.setLastname("Sherali");

        System.out.println(p1.getAge());
        System.out.println(p1.getFirstname());
        System.out.println(p1.getLastname());

        System.out.println(p1);



    }
}

