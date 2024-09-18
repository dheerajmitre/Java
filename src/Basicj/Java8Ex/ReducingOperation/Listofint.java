package Basicj.Java8Ex.ReducingOperation;

import java.util.Arrays;
import java.util.List;

public class Listofint {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("product of all elements: " + product);

    }

}
