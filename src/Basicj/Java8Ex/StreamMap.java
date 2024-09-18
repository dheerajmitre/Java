package Basicj.Java8Ex;

import java.util.List;
import java.util.ArrayList;


public class StreamMap {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Devashi");
        names.add("Joh");
        names.add("antika");
        names.add("jayessh");
        names.add("jayesh");

        //Sorting names Acoording to length

        names.stream().map(name -> name.length()).forEach(name -> System.out.println(name));
    }

}
