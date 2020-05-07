package day32.nonAccessModifier.finalModifier;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex2 {
    final Set<Integer> uniqueNumbers = new HashSet<>();


    public void sort() {
        // cannot reassign final variable after initialized
        // uniqueNumbers = new TreeSet<>();
    }
}
