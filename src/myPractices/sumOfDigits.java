package myPractices;

public class sumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits("D1I2L3"));
    }

    public static int sumOfDigits(String str){
        int sum = 0;
        char[] ch = str.toCharArray(); // D, !, I, 2, L, 3
        for (char each:ch) {
            if (Character.isDigit(each)){ // checking digits in Array ch
                sum += Integer.valueOf(""+each);  // adding each digit, need to put "" because ch is char Array
            }
            System.out.println(sum);
        }
        return sum;
    }
}
