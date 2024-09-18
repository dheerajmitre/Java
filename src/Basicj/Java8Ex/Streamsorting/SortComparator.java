package Basicj.Java8Ex.Streamsorting;

import java.util.ArrayList;
import java.util.List;

public class SortComparator {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("1234");

        names.add("456789");

        names.add("123");

        names.add("12");

        names.add("1");

        //Sorting based on the length of the string

        names.stream().sorted(( name1, name2) -> name1.length()- name2.length())
                .forEach(name -> System.out.println(name));

    }
}
