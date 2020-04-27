package day26;

import java.util.ArrayList;
import java.util.HashMap;

public class Task2 {
    //create method that returns map of member list in discord
    /*
    NJ Manager
        Halit
    Admin
        Fetih
        TechnoStudy
    NJ Teacher
        Dauke
        Dos
        Sena
     */

    //                   Position, list of members
    public static HashMap<String, ArrayList<String>> getMemberMap() {
        HashMap<String, ArrayList<String>> discordMembers = new HashMap<>();
        //position1 =  NJ Manager
        //members1: {Halit}
        String position1 = "NJ Manager";
        ArrayList<String> members1 = new ArrayList<>();
        members1.add("Halit");

        discordMembers.put(position1, members1);

        //position2 =  NJ Teachers
        //members2: {Dauke, Dos, Sena, Tuba}
        String position2 = "NJ Teachers";
        ArrayList<String> members2 = new ArrayList<>();
        members2.add("Dauke");
        members2.add("Dos");
        members2.add("Sena");
        members2.add("Tuba");

        discordMembers.put(position2, members2);


        return discordMembers;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> memberMap = getMemberMap();
    }

}
