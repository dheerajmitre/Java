package Basicj.Java8Ex;


import java.util.List;
import java.util.ArrayList;

public class StreamMap{

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        // Adding names to the list
        names.add("Deva");
        names.add("Joh");
        names.add("antika");
        names.add("jayessh");
        names.add("jayesh");

        names.stream().map(name -> name.length()).forEach(length -> System.out.println(length));
    }
}
