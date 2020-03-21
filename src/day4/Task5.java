package day4;

public class Task5 {

    // create two variables with data types char and int
    // part 1
    // convert int to char, and print out with meaningful out

    public static void main(String[] args) {
        int number = 68;
        char aChar = (char) number;

        System.out.println( "converting " + number + " to char, will give me " + aChar );

        String result = "converting " + number + " to char, will give me " + aChar;
        System.out.println( result );

    }
}
