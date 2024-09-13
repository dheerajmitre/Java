package Basicj.Java8Ex;

public interface ABCD {
    void test();          // Abstarct Method

    void show();

    default void display() {              //Default Method
        System.out.println("giooo");
    }
}

class A1 implements ABCD {
    @Override
    public void test() {
        System.out.println("Dheeraj");
    }

    @Override
    public void show() {

    }

    @Override
    public void display() {
        System.out.println("Mitre");
        ABCD.super.display();
    }

    class A2 implements ABCD {

        @Override
        public void test() {
        }

        @Override
        public void show() {

            System.out.println("Jioo");

        }
    }
}

class Result {

    public static void main(String[] args) {
        A1 obj = new A1();
        obj.test();
        obj.display();
        obj.show();
    }
}

