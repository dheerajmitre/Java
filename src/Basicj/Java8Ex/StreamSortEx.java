package Basicj.Java8Ex;

import java.util.ArrayList;
import java.util.List;

public class StreamSortEx {

    public static void main(String[] args) {

        List<String> obj = new ArrayList<String>();

        obj.add("Pune");
        obj.add("Purna");
        obj.add("nanded");
        obj.add("Mp");
        obj.add("Goa");
        obj.add("Hiii");

        obj.stream().sorted().forEach(s-> System.out.println(s));

    }
}
