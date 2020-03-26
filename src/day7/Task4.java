package day7;

public class Task4 {
    // Write a java program to compare two strings for equality
    // s = "Java"  p = "C++"
    // false

    public static void main(String[] args) {
        String s = "Java";
        String p = "C++";
        System.out.println( "is s equals to p: " + s.equals( p ) );

        s = "abc"; //reassign
        p = "abc";
        System.out.println( "is s equals to p: " + s.equals( p ) );



    }


}
