package day25;

import java.util.HashMap;

public class Task1 {
    // Write a Java program to associate
    // the specified value with the specified key in a HashMap.
    // constrains: do not use Map<String, Double>

    //ex: HashMap<String, String>
    //    HashMap<Integer, String>
    public static HashMap<String, String> getUsers() {
        //////  username, password
        HashMap<String, String> users = new HashMap<>();
        users.put("arman", "123qweasdzxc");
        users.put("techno", "*&^%$123QWE");
        users.put("hacker", "dummyPassword");
        return users;
    }

    // create method to copy all of the mappings
    // from the specified map and return copied map
    public static HashMap<String, String> copyMap(HashMap<String, String> map) {
        return new HashMap<>(map);
    }

    // create method to remove specified entry from map
    public static void removeEntry(HashMap<String, String> map, String key) {
        map.remove(key);
    }

    // create method to get value at specified position
    public static String getValue(HashMap<String, String> map, String key) {
        return map.get(key);
    }

    // create method to check if key is present/exists in the map
    public static boolean hasKey(HashMap<String, String> map, String key) {
        return map.containsKey(key);
    }

    // create method to check if value is present/exists in the map
    public static boolean hasValue(HashMap<String, String> map, String value) {
        return map.containsValue(value);
    }

    // create method that returns size of your map
    public static int getMapSize(HashMap<String, String> map) {
        return map.size();
    }

    // create method to remove all of the mappings/entries from a map
    public static void removeAll(HashMap<String, String> map) {
        map.clear();
    }


    public static void main(String[] args) {
        HashMap<String, String> users = getUsers();
        System.out.println("users: " + users);

        HashMap<String, String> copy = copyMap(users);
        removeEntry(copy, "arman");
        System.out.println("copy: " + copy);


        boolean hasArman = hasKey(users, "arman");

        boolean hasDummyPassword = hasValue(users, "dummyPassword");
        if(hasDummyPassword) {
            System.out.println("You should change you password!!!");
        }

        System.out.println("Size of users maps is: " + getMapSize(users));

        removeAll(users);
        System.out.println("users after clear: " + users);

    }

}


