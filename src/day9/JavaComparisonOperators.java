package day9;

public class JavaComparisonOperators {
/*
 ==
!=
>
<
>=
<=
 */

    public static void main(String[] args) {
        int a = 50;
        int b = 50;

        System.out.println( "is a equals to b: " + (a == b) );
        System.out.println( "is a not equals to b: " + (a != b) );
        System.out.println( "is a greater than b: " + (a > b) );
        System.out.println( "is a less than b: " + (a < b) );

        System.out.println( "is a greater than or equals to b: " + (a >= b) );
        System.out.println( "is a less than b or equals to b: " + (a <= b) );

    }

}
