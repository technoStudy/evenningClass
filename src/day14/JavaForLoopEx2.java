package day14;

public class JavaForLoopEx2 {

    public static void main(String[] args) {
        // print numbers from 10 to 0
        for(int i = 10; i >= 0; i--) {
            System.out.println( "i:" + i );

        }

        int i = 10;
        while(i >= 5) {
            System.out.println( "while:" + i );
            i--;
        }


    }
}
