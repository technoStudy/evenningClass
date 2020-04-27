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
        hashMap.put("Five", 5);

        System.out.println("HashMap: " + hashMap);

        //sorts entries by keys in natural order
        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);// copy from map above
        System.out.println("TreeMap: " + treeMap);
    }
}
