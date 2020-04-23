package day24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task2 {
    // create HashSet, TreeSet, LinkedHashSet of given integers and print them
    // [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6));

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6)); // or hashSet
    }

}
