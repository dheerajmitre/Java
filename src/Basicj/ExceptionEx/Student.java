package Basicj.ExceptionEx;

public class Student {
    public static void main(String[] args) {

        int[] numbers = new int[9];

        try {
            numbers[10] = 8;
            int result = 10 / 4;
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bonds " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Airthmetic Error: " + e.getMessage());
        }
    }
}

