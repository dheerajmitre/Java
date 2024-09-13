package Basicj.Java8Ex;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {

        List<String> originallist = Arrays.asList("Mumbai", "Pune", "Parbhani", "Purna",
                "Purna", "Nanded", "Ahemadnagar", "Dhule", "Pune","Tdit");

        List<String> Result = originallist.stream().distinct().collect(Collectors.toList());

        System.out.println(Result);

    }
}

