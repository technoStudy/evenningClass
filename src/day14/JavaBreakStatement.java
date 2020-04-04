package day14;

public class JavaBreakStatement {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            System.out.println( i );

            if(i == 2) {
                break;
            }
        }

        System.out.println("End of code");

    }
}
