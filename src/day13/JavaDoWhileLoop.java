package day13;

public class JavaDoWhileLoop {

    public static void main(String[] args) {
        int i = 10;
        while(i <= 5) { // 10 <= 5  false
            System.out.println( "while: " + i++ );
        }

        System.out.println();

        i = 10;
        do {
            System.out.println( "do-while: " + i++ );
        } while(i <= 5); // 10 <= 5 false

    }

}
