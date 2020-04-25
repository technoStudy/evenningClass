package day26;

import java.util.HashMap;
import java.util.TreeMap;

public class JavaTreeMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        System.out.println("HashMap: " + hashMap);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zero", 0);
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        treeMap.put("Four", 4);
        System.out.println("TreeMap:" + treeMap);


    }
}
