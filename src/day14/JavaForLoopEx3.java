package day14;

public class JavaForLoopEx3 {

    public static void main(String[] args) {
        String text = "Hello !!!";
        //             01234
        System.out.println( text );
        //H
        //e
        //l
        //l
        //o

        for(int i = 0; i < text.length(); i++) {
            char letter = text.charAt( i );

            System.out.println( letter );

        }
    }

}
