package day26;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class JavaLinkedHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        System.out.println("HashMap: " + hashMap);

        //maintains insertion order
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();// copy from map above
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);
        linkedHashMap.put("Five", 5);

        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
