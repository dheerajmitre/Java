package Basicj.Java8Ex.Streamsorting;
import java.util.List;
import java.util.ArrayList;

public class ParallelEx {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.add("Dheeraj");

        names.add("Jz");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("Mumbai");

        names.parallelStream().sorted().filter((String name) -> name.length() > 3).skip(2).forEach(s-> System.out.println(s));


}
}
