package Basicj.Java8Ex;

import java.util.ArrayList;
import java.util.List;


public class listostreams {

    public static void main(String[] args) {


        List<String> listofStrings = new ArrayList<>();

        listofStrings.add("one");

        listofStrings.add("two");

        listofStrings.add("three");

        listofStrings.add("four");

        listofStrings.add("five");

       // listofStrings.stream().forEach(System.out.println);

        listofStrings.stream().forEach(s-> System.out.println(s));

    }
}
