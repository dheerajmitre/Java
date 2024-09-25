package Basicj.Java8Ex.Collection.LinkedlistEx;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex3 {

    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<String>();
        //use add () method to add Values in the linked list

        l_list.add("Dheeraj");
        l_list.add("Mitre");
        l_list.add("Chakru");
        l_list.add("Soni");
        l_list.add("Chakru");

        //Set Iterator at specified index

        Iterator p = l_list.listIterator(2);

        //print list from  second  position
        while(p.hasNext()){
            System.out.println(p.next());

        }
    }
}