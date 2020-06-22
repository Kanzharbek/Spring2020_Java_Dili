package day50_polymorphisim;

public class Encapsulation {
    private String username = "Cybertek";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

class Test {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        System.out.println(obj.getUsername());
        obj.setUsername("UC Santa Cruz");
        System.out.println(obj.getUsername());

    }
}