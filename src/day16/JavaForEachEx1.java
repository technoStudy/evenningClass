package day16;

public class JavaForEachEx1 {
    public static void main(String[] args) {

        int[] scores = {50, 90, 100, 75};

        // create regular for using scores.fori
        // create reversed for using scores.forr
        // create for-each using scores.for



        for(int score : scores) {
            System.out.println(score);
        }

        for(int i = 0; i < scores.length ; i++) {
            int score = scores[i];

            System.out.println(score);
        }
    }
}
