package Basicj.CollectionsEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

    public static void main(String[] args) {

        Map<String, Integer> hashmap = new HashMap<>();

        hashmap.put("java", 100);
        hashmap.put("java", 100);
        hashmap.put("java", 100);
        hashmap.put("java", 100);

        System.out.println(hashmap.size());
    }
}


// map doesnot not allow duplicate keys
//we can enter duplicate values in map
// map allow only 1 null value key in map
// Map does not follow insertion order while putting elements
//