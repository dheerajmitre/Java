package Basicj.Java8Ex.Collection.LinkedlistEx;

import java.util.LinkedList;

//insert the elemnent into linked list at the first and last postions of list

public class  Ex6 {

    public static void main(String[] args) {

        LinkedList<String> obj1 = new LinkedList<String>();
        obj1.add("Red");
        obj1.add("Green");
        obj1.add("Black");
        obj1.add("White");
        obj1.add("Blue");

        System.out.println("original linked list" +obj1 );
        obj1.addFirst("Silver"); // add frirst elemnet at beginning

        obj1.addLast("Black");  // add Last element at ending
        System.out.println("Final linked list"+ obj1);
    }

}
