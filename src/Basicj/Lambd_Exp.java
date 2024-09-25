package Basicj;

// Define a functional interface
@FunctionalInterface
interface SumCalculator {
    int sum(int x, int y);
}
public class Lambd_Exp {

    public static void main(String[] args) {
        SumCalculator sumCalculator = (x, y) -> x + y;

        int result = sumCalculator.sum(7, 14);
        System.out.println("Sum (7, 8): " + result);

        result = sumCalculator.sum(15, -35);
        System.out.println("Sum (15, -35): " + result);
    }
}
