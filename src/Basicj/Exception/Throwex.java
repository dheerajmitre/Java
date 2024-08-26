package Basicj.Exception;
public class Throwex {
    static void fun()
    {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException  e){
            System.out.println("caught");
            throw e;

        }
    }

    public static void main(String[] args) {
        try{
            fun();
        }
        catch(NullPointerException e){
            System.out.println("caught in main");
        }
    }
}


