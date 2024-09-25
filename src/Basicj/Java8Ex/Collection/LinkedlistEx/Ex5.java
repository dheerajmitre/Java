package Basicj.Java8Ex.Collection.LinkedlistEx;

import java.util.LinkedList;
public class Ex5 {
    //insert the  Specified element at the Specified position in the linked list

    public static void main(String[] args) {

        LinkedList<String> obj1 = new LinkedList<String>();
        obj1.add("Green");
        obj1.add("Black");
        obj1.add("Red");
        obj1.add("Yellow");
        obj1.add("ornge");
        obj1.add("apple");
        obj1.add("peruu");

        System.out.println("original linked list: ");
        System.out.println("let add the yellow color after the red color:");
        obj1.add(0,"Yellow");
        obj1.add(1, "Red");
        obj1.add(2,"green");

        //print the list
        System.out.println("the linked list"+ obj1);
    }
}