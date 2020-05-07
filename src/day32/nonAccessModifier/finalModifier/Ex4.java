package day32.nonAccessModifier.finalModifier;

import java.util.ArrayList;

public class Ex4 {
    final ArrayList<String> names = generateNames();
    final ArrayList<String> surnames = generateSurnames();

    // dummy method that generatesNames
    public ArrayList<String> generateNames() {
        return null;
    }

    // dummy method that generatesSurnames
    public ArrayList<String> generateSurnames() {
        return null;
    }

    public void print() {
        // cannot reassign to final variable
        // names = generateSurnames();
        // surnames = generateNames();
    }


}
