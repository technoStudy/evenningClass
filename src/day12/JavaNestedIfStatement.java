package day12;

public class JavaNestedIfStatement {


    public static void main(String[] args) {
        int num = 24;

        if(num < 100) {
            System.out.println( "number is less than 100" );

            if(num > 50) {
                System.out.println( "number is greater than 50" );
            } else if(num < 25) {
                System.out.println( "number is less than 25" );
            }
        }
    }
}
