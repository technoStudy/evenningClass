package day14;

public class JavaContinueStatement {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            if(i <= 2) {
                continue;
            }

            System.out.println( i );
        }
    }
}
