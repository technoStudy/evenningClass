package day15;

public class JavaLabeledLoops {

    public static void main(String[] args) {

        OUTER_LOOP:
        for(int i = 0; i < 5; i++) {
            INNER_LOOP:
            for(int j = 0; j < 5; j++) {
                if(j == 3) {
                    break OUTER_LOOP;
                }
                System.out.println( "i:" + i + " j:" + j );
            }
            System.out.println();
        }

        System.out.println( "End of code" );


        myIf: if(5<4){

        }

        String a = "";
        mySwitch: switch (a){

        }

        myTry: try{

        }catch (Exception e){

        }
    }
}
