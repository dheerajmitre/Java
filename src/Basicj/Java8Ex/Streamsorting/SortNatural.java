package Basicj.Java8Ex.Streamsorting;

import java.util.ArrayList;
import java.util.List;

public class SortNatural {

    public static void main(String[] args) {

        List<String> obj = new ArrayList<String>();

        obj.add("Dheeraj");
        obj.add("Mitre");
        obj.add("Abhii");
        obj.add("Naresh");
        obj.add("sameer");
        obj.add("shau");
        
        obj.stream().sorted().forEach(s-> System.out.println(s));
    }
}
