package Basicj.Exception;

public class Finallykeyword {
    public static void main(String[] args) {


        int a = 5, b = 0, result;


        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println("which type of exception");
        }
        finally {
            System.out.println("hello world");
        }
    }

}





