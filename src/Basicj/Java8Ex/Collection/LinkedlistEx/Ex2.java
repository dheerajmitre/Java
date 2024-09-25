package Basicj.Java8Ex.Collection.LinkedlistEx;

import java.util.LinkedList;
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {

        LinkedList<String> obj = new LinkedList<String>();
        obj.add("Dheeraj ,");
        obj.add("Mitre ,");
        obj.add("Chakru ,");
        obj.add("Nilu ,");
        obj.add("Soni ,");
        //print the linked list
        for (String element : obj){

            System.out.print(element);
        }
    }
}