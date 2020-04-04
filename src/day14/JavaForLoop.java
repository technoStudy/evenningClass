package day14;

public class JavaForLoop {

    public static void main(String[] args) {
        //while loop
        int i = 0;
        while(i < 5) {
            System.out.println( "i:" + i );
            i++;
        }

        System.out.println();
        //for loop
        for(int a = 0; a < 5; a++) {
            System.out.println( "a:" + a );
        }

        // wrong for loop
        int b = 0;
        for(; b < 5; ) {

            b++;
        }


    }

}
