package Basicj.ExceptionEx;
import java.util.Scanner;

public class DividedByEx {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int [] array= {1,2,3,4,5,6,7,8};

            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            try {

                int result = numerator / denominator;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println(e + "This is Math Rule We can not Divided By Zero" );
            }

            scanner.close();
        }
    }

