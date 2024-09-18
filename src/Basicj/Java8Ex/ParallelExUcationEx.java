package Basicj.Java8Ex;


import java.util.ArrayList;
import java.util.List;


public class ParallelExUcationEx {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
      names.add("Sameer");
      names.add("naresh");
      names.add("Angad");
      names.add("Chaks");

      names.parallelStream().filter((String D )-> D.length() >3).skip(2).forEach(s-> System.out.println(s));
    }
}
