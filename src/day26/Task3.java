package day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task3 {
    /*
    NJ MANAGER
        Halit
        Yusuf
    NJ Students
        Amal
        Bulut
        Burak
        Ekrem
        Huseyin
     */

    public static void main(String[] args) {
        HashMap<String, List<String>> discordMembers = new HashMap<>();

        String role = "NJ MANAGER";
        ArrayList<String> users = new ArrayList<>();
        users.add("Halit");
        users.add("Yusuf");
        discordMembers.put(role, users);

        discordMembers.put("NJ Students", Arrays.asList("Amal", "Bulut", "Nebahat"));
    }

}
