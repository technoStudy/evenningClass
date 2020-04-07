package day15;

public class DebugEx3 {

    public static void main(String[] args) {

        for(int i = 0; i < 40; i++) {
            if(i / 15 == 1) {
                continue;
            }
            System.out.println( i );
        }
    }
}
