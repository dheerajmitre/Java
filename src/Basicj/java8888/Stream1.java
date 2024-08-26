package Basicj.java8888;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(2, 4, 50, 21, 22,3,2);


//        List<Integer> list2 = new ArrayList<>();
////        list2.add(12);
////        list2.add(34);
////        list2.add(55);
////        list2.add(99);

        System.out.println(list1);

        //using stream
        Stream<Integer> stream = list1.stream();
        List<Integer>newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

//        Stream<Integer> Stream1 = (Stream<Integer>) list1.stream().filter(i->i% 2 == 0).collect(Collectors.toList());

    }
}
