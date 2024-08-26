package Basicj.CollectionsEx;

import java.util.ArrayList;
import java.util.List;

public class Enhanceforloop {

    public static void main(String[] args) {

        List<Integer> List = new ArrayList<>();
        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);
        List.add(500);

        for (int i = 0; i < List.size(); i++) {

            System.out.println("Value list in the are " + List.get(i));

        }

//enhanced for loop

        for (Integer a : List) {
            System.out.println("Value are the " + a);
        }
    }
}
