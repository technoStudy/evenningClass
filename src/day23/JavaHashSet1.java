package day23;

import java.util.HashSet;

public class JavaHashSet1 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        boolean add_1 = set.add(1);
        boolean add_2 = set.add(2);
        boolean add_3 = set.add(3);
        boolean add_3_again = set.add(3);
        boolean add_1_again = set.add(1);
    }
}
