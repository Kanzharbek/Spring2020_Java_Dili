package replits;

public class GasTank {

    double amount = 0;
    double capacity;

    public GasTank(double capacity) { // constructor
        this.capacity = capacity;
    }

    public void addGas(double a) { // instance method. MUST be called through an object
        if ((amount + a) > capacity) {
            capacity = amount + a;
        } else {
            amount += a;
        }
    }

    public void useGas(double a) { // instance method. MUST be called through an object
        if ((amount - a) < 0) {
            amount = 0;
        } else {
            amount -= a;
        }
    }

    public boolean isEmpty() { // instance method. MUST be called through an object
        if (amount < 0.1) {
            return true;
        }
        return false;
    }

    public boolean isFull() { // instance method. MUST be called through an object
        if (amount>capacity) {
            return true;
        }
        return false;
    }

    public double getGasLevel() { // getter
        return amount;
    }

    public double fillUp(){ // instance method. MUST be called through an object
        return capacity = (capacity+amount) - amount;
    }

}

class GasTankTest{

    public static void main(String[] args) {

        GasTank n = new GasTank(18); // capacity 18
        System.out.println(n.getGasLevel());

        n.addGas(10); // 10
        System.out.println(n.getGasLevel());

        n.useGas(5); // 5
        System.out.println(n.getGasLevel());

        n.useGas(10); // 0
        System.out.println(n.getGasLevel());

        System.out.println(n.isEmpty()); // true
        System.out.println(n.isFull()); // false

        System.out.println(n.fillUp());


    }
}
