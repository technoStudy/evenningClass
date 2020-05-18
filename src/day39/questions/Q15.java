package day39.questions;

import java.util.HashSet;
import java.util.Set;

class Person {
    String name;
}

public class Q15 {


    public static void main(String[] args) {
        final int a = 5;
//        a = 4;


        final Set<String> set = new HashSet<>();
//        set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        System.out.println("1. " + set);
        set.remove("Red");
        System.out.println("2. " + set);


        final Person dos = new Person();
        dos.name = "Dos";
        dos.name = "Ali";

        //dos = new Person();
    }
}
