package day24;

import java.util.Arrays;
import java.util.HashSet;

public class Task1 {
    // create two set of member names, with duplicates
    // in main method
    public static void main(String[] args) {
        HashSet<String> developers = new HashSet<>(Arrays.asList("Dauke", "Adilkhan", "John", "Alice", "Max"));
        HashSet<String> testers = new HashSet<>(Arrays.asList("Ice", "Max", "Aydin", "Damir", "John", "Alice"));

        int totalMemberCount = totalMemberCount(developers, testers);
    }

    // create method to find how many members in total
    public static int totalMemberCount(HashSet<String> team1, HashSet<String> team2) {
        HashSet<String> total = new HashSet<>(team1);
        total.addAll(team2);

        return total.size();
    }

    // create method to find who is working in two teams

    // create method to find who are assigned to only one team



}















