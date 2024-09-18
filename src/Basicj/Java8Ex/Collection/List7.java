package Basicj.Java8Ex.Collection;
// Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
import java.util.List;
public class List7{

    public static void main(String[] args) {

        List<String> obj1 = new ArrayList<String>();

        obj1.add("add");
        obj1.add("Green");
        obj1.add("Black");
        obj1.add("White");
        obj1.add("Sun");
        obj1.add("Moon");

        //Print list the again
        System.out.println("list before sort " + obj1);

        Collections.sort(obj1);
        System.out.println("list After sort" + obj1);

    }
}
