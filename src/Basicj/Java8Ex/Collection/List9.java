package Basicj.Java8Ex.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List9 {

    public static void main(String[] args) {

        List<String> obj1 = new ArrayList<String>();

        obj1.add("1");
        obj1.add("2");
        obj1.add("3");
        obj1.add("4");
        obj1.add("5");
        obj1.add("6");

        System.out.println("List:" + obj1);
        List<String>List1 = new ArrayList<String>();


        List1.add("A");
        List1.add("B");
        List1.add("C");
        List1.add("D");

        System.out.println("List: " + List1);
        Collections.copy(obj1 , List1);

        System.out.println("obj1: " + obj1);
        System.out.println("List1: " + List1);

    }
}
