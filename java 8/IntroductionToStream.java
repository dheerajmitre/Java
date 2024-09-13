package Basicj.Java8Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntroductionToStream {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        names.add("David");
        names.add("David");
        names.add("Brijesh");
        names.add("Brijesh");

//        Set<String> set = names.stream().collect(Collectors.toSet())
//        System.out.println(set);

        List<String> result = names.stream().distinct().filter(s-> s.length() > 5).sorted().collect(Collectors.toList());
        System.out.println(result);

    }
}

