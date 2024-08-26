package Basicj.CollectionsEx;


 abstract class bank1 {
    abstract int interest();
}

class sbi extends bank1 {
    int interest() {
        return 3;
    }
}

    class axis extends bank1 {
        int interest() {
            return 9;
        }
    }
        class Result {
            public static void main(String[] args) {

                bank1 b = new sbi();
                System.out.println("rate of interest"+ " " +b.interest());
                bank1 c= new axis();
                System.out.println("rate of interest" +c.interest());
            }
        }

