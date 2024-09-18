package Basicj.Java8Ex;

import java.util.List;
import java.util.ArrayList;
public class SortingEX {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("angad");

        names.add("Rohit");

        names.add("Dheeraj");

        names.add("Sameer");

        names.add("Naresh");

        names.stream().sorted().forEach(s->System.out.println(s));
    }
}

