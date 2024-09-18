package Basicj.CollectionsEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ListvssetEx {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list.size() + " Printing List elements " + list); //8

        list.remove(4);
        System.out.println(list.size() + " Printing List elements " + list);//7

    }
    }

