package Basicj.Java8Ex.Collection.LinkedlistEx;


public class ex7 {



   void  parentmethod(){
        System.out.println("parent");
    }


    static class child extends ex7{


        void childmethod(){
            System.out.println("child");

        }

        @Override
        void parentmethod(){
            System.out.println("this is overide method");
        }

        class main{
            public static void main(String[] args) {

                ex7 N = new child();
                child M = new child();
                M.childmethod();
                N.parentmethod();


            }
        }
    }
}