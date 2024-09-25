package Basicj.Practice;


public interface Bicycle {

    void applyBrake(int decrement);
    void Speedup(int increment);

    default void Test() {
        System.out.println("DDDD");
    }

    static void Test1() {
        System.out.println("Sssss");
    }
}

interface Bike {
   void chain(String j);
    void Body (String I);
}

class RangeRover implements Bicycle,Bike {

    int speedup = 7;

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Incremnt");
    }

    @Override
    public void Speedup(int increment) {
        System.out.println("Decrement");
    }

    @Override
    public void Body(String I) {
        System.out.println("\"Plastic body");
    }

    @Override
    public void chain(String j) {
        System.out.println("Iron");
    }
}

class TestM {

    public static void main(String[] args) {

        RangeRover C = new RangeRover();
        {
            C.applyBrake(1);
            C.Speedup(3);
            C.Test();
C.chain("yryr");
C.Body("DDDD");
            Bicycle.Test1();
            System.out.println(C.speedup);

        }
    }
}