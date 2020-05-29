package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catch_blocks {
    public static void main(String[] args) {

        try {
            System.out.println(100 / 0);
        } catch (ClassCastException e) {
            System.out.println("Class cast");
        } catch (NoSuchElementException e) {
            System.out.println("No such element");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
