package day20;

import java.util.Arrays;

public class JavaMethodVarargsEx1 {
    //public static void printNames(String[] names){
    public static void printNames(String... names) {
        System.out.println(Arrays.toString(names));
    }

    public static void main(String[] args) {
        printNames("Amal", "Ayla", "Dogan", "Enes");

        String[] names = {"Amal", "Ayla", "Dogan", "Enes"};
        printNames(names);
    }

}
