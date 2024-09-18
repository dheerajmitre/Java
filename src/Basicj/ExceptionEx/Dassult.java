package Basicj.ExceptionEx;

public class Dassult {

    public static void main(String[] args) {

        try {

            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by Zero ");

//          finally {
//            System.out.println("this will always Execute");
//       }

        }
    }
}
