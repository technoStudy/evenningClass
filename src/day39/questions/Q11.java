package day39.questions;

import java.util.List;
import java.util.Map;

public class Q11 {

    public void nonStaticMethod() {
        System.out.println("nonStaticMethod");
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public static void main(String[] args) {
        Q11 q11 = new Q11();

        q11.nonStaticMethod();

        Q11.staticMethod();

        Map<String, String> map;

        List<String> list;

    }
}
