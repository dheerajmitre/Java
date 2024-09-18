package Basicj.CollectionPractice;
import java.util.ArrayList;
import java.util.List;
public class Excercise2 {

    public static void main(String[] args) {

        List<String> Tag = new ArrayList<String>();
        Tag.add("Red");
        Tag.add("Blue");
        Tag.add("Orange");
        Tag.add("Blue");
        Tag.add("Upper");
        
        for (String element : Tag){
            System.out.println(element);
        }
    }
}
