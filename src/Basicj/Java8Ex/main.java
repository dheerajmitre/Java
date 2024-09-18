package Basicj.Java8Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        List<Data> datalist = Arrays.asList(

                new Data ("Dhoni", 100,23000),
                new Data ("Yvi",   60,50000),
                new Data ("Dheeraj", 56 , 70000),
                new Data ("Sachin",300,99000)

        );

//                String getName;
//                Integer getId;

        Map<String,Integer> Datamap = datalist.stream().collect(Collectors.toMap (Data ->Data.getName() , Data-> Data.getId()));

        Datamap.forEach((name , id)-> System.out.println("name =" +name + " " +"id=" + id  ));

    }
}