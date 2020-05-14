package day37.exceptionTypes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    public static void main(String[] args) {


        //checked exception -> more predictable
        try {
            FileInputStream fis = new FileInputStream("test.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
