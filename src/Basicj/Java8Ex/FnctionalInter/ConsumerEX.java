package Basicj.Java8Ex.FnctionalInter;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerEX {

    public ConsumerEX(String abhijeet) {

    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();


        names.add("Dheeraj");
        names.add("Mitre");
        names.add("Rohit");

        // Define consumer Represents an operation Which takes an argument and return nothing
        Consumer<String> nameConsumer = name -> System.out.println("consumed name : " + name);
        for (String s : names) {
            nameConsumer.accept(s);
        }
    }
}
