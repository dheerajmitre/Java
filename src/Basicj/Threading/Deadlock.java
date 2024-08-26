//package Basicj.Threading;
//
//public class Deadlock {
//    final static String R1 = "welcome to purna";
//    final static String R2 = "Mahavir nagar Purna";
//}
//public static void main(String []args) {
//Thread T1 = new Thread(){
//    //implementing run method
//
//    public void run(){
//        synchronized (R1){
//            System.out.println("thread T1 is locked : > Resourceses R1");
//            //Thread T1 locking the R2 Resources
//            synchronized (R2){
//                System.out.println("Thread T1 is locked : > Resourceses R2");
//
//            }
//        }
//    }
//};
////creating thread 2
//Thread T2 = new Thread (){
//    public void run(){
//        //thread T2 is Locking the R2 Resources
//        synchronized (R2){
//        }
//
//    }
//};
//}
