package Basicj.Java8Ex.Collection.LinkedlistEx;

import java.util.Iterator;
import java.util.LinkedList;


//Write the code for iterator the elemnt in reverse order

public class Ex4 {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<Integer>();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);


        //Print the original list
        System.out.println("original list " + obj);
        Iterator it = obj.descendingIterator();

        //print iterator list elemnets in reverse order
        System.out.println("Reverse in order " + obj);
        while(it.hasNext() ) {
            System.out.println(it.next());
        }
    }
}


