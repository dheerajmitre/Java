package Basicj.Threading;

public class ThreadExtendtest extends Thread {

void test(){

    System.out.println("lets call this method from run method");

     }

@Override

    public void run() {

        System.out.println("Thread is in running State");

        test();

    }

    public static void main(String []args) {

    ThreadExtendtest thread = new ThreadExtendtest();

    thread.start();
    thread.run();

    }
}