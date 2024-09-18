package Basicj.Java8Ex.ReducingOperation;

import java.util.Arrays;
import java.util.List;

public class Concatenating {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Dheeraj","Mitre","Purna");

        String concatenatedstring = words.stream().reduce("",(a,b)->a + " " + b);

        System.out.println("concatenetstring:" + concatenatedstring.trim());
    }
}
