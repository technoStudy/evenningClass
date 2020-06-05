package day49.javaInterface.example2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsingSet {

    public static void printSet(Set<Integer> set){
        for(Integer n: set){
            System.out.print(n + " ");
        }
    }


    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(2,1,3));
        System.out.println("HashSet");
        printSet(hashSet);


        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(2,1,3));
        System.out.println("\nTreeSet");
        printSet(treeSet);
    }
}
