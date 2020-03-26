package day6;

public class Task3 {

    // Write a program that sums two strings length
    //ex: "ABC", "Z" => 3+1 =>
    //output: "Length is 4"

    //part 1, just create two variable

    //part 2, provide string using scanner

    public static void main(String[] args) {
        String first = "ABC";
        String second = "ABC";

        int firstLength = first.length();
        int secondLength = second.length();

        int sum = firstLength + secondLength;

        System.out.println( "Sum of length is: " + sum );
    }
}
