package day11;

public class Task5 {
    // Write a Java program to check whether a character is alphabet or not.
    // use just lowercase letters, a to z
    // hint: char is also numeric

    // ex1:  h => it is alphabet character
    // ex2: % => it is not in alphabet

    public static void main(String[] args) {
        char letter = '%';

        // elvis
        boolean isAlphabet = letter >= 97 && letter <= 122;
        System.out.println( isAlphabet ? "its in Alphabet" : "something different" );

    }
}
