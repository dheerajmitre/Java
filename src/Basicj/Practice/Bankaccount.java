//package Basicj.Practice;
//public interface Bankaccount {
//    double getbalance();
//
//    default void displayDetails(){
//        System.out.println("Accounct balance " + getbalance());
//    }
//
//    static void showpolicy(){
//        System.out.println("All bank is comply with bank policies");
//    }
//}
//
//class SavingAccount implements Bankaccount {
//public SavingAccount(double initialbalance ){
//
//    this.balance=initialbalance;
//}
//private double balance;
//    @Override
//    public double getbalance() {
//        return 0;
//    }
//    @Override
//    public void displayDetails() {
//        Bankaccount.super.displayDetails();
//    }
//}
//
//class Maint{
//    public static void main(String[] args) {
//        Bankaccount saving = new SavingAccount(1500.00) {
//
//
//        }
//
//    }
