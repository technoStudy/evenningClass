package day24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JavaLinkedHashSetAndTreeSet {

    public static void main(String[] args) {
        // HashSet
        HashSet<String> hashSet = new HashSet();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        hashSet.add("Apple");

        System.out.println("HashSet: " + hashSet);

        //TreeSet = sorted set
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Z");
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("C");


        System.out.println("TreeSet: " + treeSet);

        //LinkedHashSet = maintains insertion order// order of adding elements to set is maintained
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Five");
        linkedHashSet.add("Apple");

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
