package day25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaHashMap {
    // Position, Salary
    // SDET, 300_000
    // QA Tester, 200_000

    public static void main(String[] args) {
//         HashMap<String, ArrayList<String>> positionSalaryDropDown = new HashMap<>();
        // manager1
        //        employee1
        //        employee2

        // HashMap<String, ArrayList<Double>> positionSalaryDropDown = new HashMap<>();
        HashMap<String, Double> map = new HashMap<>();

        //        public Object put(Object key, Object value):
//        This method is used to insert an entry in this map.
        map.put("SDET", 300_000d);
        map.put("QA Tester", 200_000d);

        map.put("SDET", 100_000d);


//        public void putAll(Map map):
//        This method is used to insert the specified map in this map.
        HashMap<String, Double> salaries = new HashMap<>();
        // 1. way
        salaries.putAll(map);
        // 2. way
        HashMap<String, Double> highSalary = new HashMap<>(map);

        // public Object remove(Object key):
        // This method is used to delete an entry for the specified key.
        highSalary.remove("SDET");

        // public Object get(Object key):
        // This method is used to return the value for the specified key.
        highSalary.put("CEO", 600_000d);
        highSalary.put("CTO", 700_000d);

        Double ctoSalary = highSalary.get("CTO");

        // public boolean containsKey(Object key):
        // This method is used to search the specified key from this map.
        boolean hasCTO = highSalary.containsKey("CTO");
        boolean hasPR = highSalary.containsKey("PR");

        // public Set keySet():
        // This method is used to return the Set view containing all the keys.
        Set<String> positions = highSalary.keySet();
        System.out.println("positions: " + positions);

//        public Set entrySet():
//        This method is used to return the Set view containing all the keys and values.
        Set<Map.Entry<String, Double>> entries = highSalary.entrySet();

        for(Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println("Key:" + key + "   Value:" + value);
        }
    }
}
