package Basicj.Java8Ex.FnctionalInter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class SupplierEx {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Dheeraj");
        names.add("Mitre");
        names.add("Rohit");
        names.add("Abhijeet");

        // Define Supplier Represents

        Supplier<String> nameSupplier = () -> new ConsumerEX("Abhijeet").toString();
        names.add(nameSupplier.get());
        String Defaultname = nameSupplier.get();
        System.out.println("Default name " + Defaultname);

    }
}