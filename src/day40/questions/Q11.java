package day40.questions;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Q11 {

    //instance member
    public void nonStaticMethod() {
        System.out.println("nonStaticMethod");
    }

    //class member
    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public static void main(String[] args) {
        Q11 question = new Q11();

        question.nonStaticMethod();
//        Q11.nonStaticMethod();

        Q11.staticMethod();

        Map<String, String> map;

        List<String> list;

        Math.random();

        Random random = new Random();
        random.nextInt();

    }
}
