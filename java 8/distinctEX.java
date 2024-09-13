package Basicj.Java8Ex;

import java.util.ArrayList;
import java.util.List;

public class distinctEX {

    public static void main (String []args){

        List<String> uniqueelement = new ArrayList<>();

        uniqueelement.add("java");

        uniqueelement.add("mava");

        uniqueelement.add("seva");
        uniqueelement.add("seva");

        uniqueelement.add("Khava");
        uniqueelement.add("Khava");

        uniqueelement.add("java");
        uniqueelement.add("java");

        uniqueelement.stream().filter((String unique )-> unique.length()> 5).forEach(D-> System.out.println(D));


    }
}
