package day15;

public class JavaNestedLoopEx1 {

    public static void main(String[] args) {

        // never do this
        han:
        for(int i = 0; i < 5; i++) {
            sen:
            for(int j = 0; j < 5; j++) {
                jen:
                for(int k = 0; k < 5; k++) {
                    john:
                    while(k < 3) {
                        ali:
                        do {

                        } while(k == 3);
                    }
                }
            }
        }

    }
}
