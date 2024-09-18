package Basicj.Java8Ex.Collection;
import java.util.ArrayList;
import java.util.List;
public class list5 {

    public static void main(String[] args) {
    List<String> obj = new ArrayList<String>();

            obj.add("redd");
            obj.add("black");
            obj.add("white");
            obj.add("sun");
            obj.add("moon");

        System.out.println("original list" + obj);

        obj.set(2,"yellow");
        //Print list the again
        System.out.println(obj);
        
    }
}