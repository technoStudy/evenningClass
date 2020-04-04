package day14;

public class JavaContinueStatementEx1 {

    public static void main(String[] args) {
        String text = "Stay at home";

        for(int i = 0; i < text.length(); i++) {
            char letter = text.charAt( i );

            if(letter == ' ' || letter == 'a') {
                continue;
            }

            System.out.println( letter );
        }

    }

}
