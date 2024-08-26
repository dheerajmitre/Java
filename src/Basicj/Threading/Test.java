package Basicj.Threading;

public class Test extends Thread {

    static String S1 = "Dheeraj";
    static String S2 = "Mitre";

    public static void main(String[] args) {
        Test obj = new Test();

        Thread t1 = new Thread() {
            public void run() {
                int n = 0;
                while (n < 1) {
                    synchronized (S1) {
                        try {
                            System.out.println(Thread.currentThread().getName()  +" " +S1);
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (S2) {
                            System.out.println(S1 + S2);
                        }
                    }
                    n++;
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                int n=0;
                while (n< 1) {
                    synchronized (S1) { // Changed lock order to S1 first
                        synchronized (S2) {
                            System.out.println(Thread.currentThread().getName() +" "+ S2);
                            System.out.println(S1 + S2);
                        }
                    }

                    n++;
                }
            }
        };

        t1.start();
        t2.start();
    }
}
