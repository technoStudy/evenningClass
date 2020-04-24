package day24;

import java.util.HashSet;

public class JavaSetMethods {

    // Set: union
    // all elements in both sets
    // A.addAll(B)
    public static HashSet<Integer> union(HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> union = new HashSet<>();
        union.addAll(setA);
        union.addAll(setB);

        return union;
    }

    // Set: intersection
    // common elements in both sets
    // A.retainAll(B)    // To find intersection
    public static HashSet<Integer> intersection(HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        return intersection;
    }

    //    Set: difference
//    A.removeAll(B) // To find the difference
    public static HashSet<Integer> difference(HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);

        return difference;
    }

    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        HashSet<Integer> union = union(setA, setB);
        HashSet<Integer> difference = difference(setA, setB);
        HashSet<Integer> intersection = intersection(setA, setB);

    }
}
