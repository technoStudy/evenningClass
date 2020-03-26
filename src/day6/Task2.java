package day6;

public class Task2 {
    // given your name and surname
    // please write initials
    // input
    // str = Michael Jackson
    // output
    // M.J.

    public static void main(String[] args) {
        String str = "Michael Jackson";

        // part 1, using substring
//        String m = str.substring( 0, 1 );
//        String j = str.substring( 8, 9 );
//
//        System.out.println( m + "." + j + "." );

        // part 2, using charAt
        char m = str.charAt( 0 );
        char j = str.charAt( 8 );
        System.out.println( m + "." + j + "." );



    }



    // extra, difficulty: hard
    // use indexOf method to find indexes of M and J
    // and use them in substring
}
