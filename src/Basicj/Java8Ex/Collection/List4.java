package Basicj.Java8Ex.Collection;
import java.util.ArrayList;
import java.util.List;


public class List4 {

    public static void main(String[] args) {

        List<String> obj = new ArrayList<String>();
        obj.add("redd");
        obj.add("black");
        obj.add("white");
        obj.add("sun");
        obj.add("moon");

        System.out.println(obj); // retrive the list

        String element = obj.get(0);
        System.out.println(element);

         element  = obj.get(2);
        System.out.println("first element:" + element);

    }
}
