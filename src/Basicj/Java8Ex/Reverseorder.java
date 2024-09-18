package Basicj.Java8Ex;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Reverseorder {
       public static void main(String[] args){

            List<Integer> decimalList = Arrays.asList(11,12,13,14,15,16,17,18);

            decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        }

    }

