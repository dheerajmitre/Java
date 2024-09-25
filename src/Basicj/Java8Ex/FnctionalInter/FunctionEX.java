package Basicj.Java8Ex.FnctionalInter;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionEX {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Dheeraj");
        names.add("Mitre");
        names.add("Rohit");

        //Define Function Represents

        //Using the Function to print the length of each name
        Function<String, Integer> namelengthFunction = name -> name.length();

        String name = "0";
        int length = namelengthFunction.apply(name);
        System.out.println("length of name: " + length);

    }

}

