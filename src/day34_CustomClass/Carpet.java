package day34_CustomClass;

public class Carpet {
    /*
    create a custom class for the carpet class that should contain the following:
	    instance variables:
			width, length, unitPrice, isPersian (boolean)
		instance methods:
		    customOrder(): sets the carpet' width, length, unitPrice, & isPersian
			calcCost(): should be able to calculate the total cost of the carpet and return it as double
			toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitPrice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
     */

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost() {
        double total = (width + length) * unitPrice;
        return (isPersian) ? total + 200 : total;
    }

    public void customOrder(double carpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetIsPersian) {
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        isPersian = carpetIsPersian;
    }

    public String toString() {
        String print = "";
        if (isPersian) {
            print = "Width: " + width + "\nLength: " + length + "\nCost: $" + unitPrice + "\nTotal price: $" + calcCost() + "\nProduct is from Turkey!";
        } else {
            print = "Width: " + width + "\nLength: " + length + "\nCost: $" + unitPrice + "\nTotal price: $" + calcCost();
        }
        return print;
    }


}
