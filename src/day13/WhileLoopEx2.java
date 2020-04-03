package day13;

public class WhileLoopEx2 {

    public static void main(String[] args) {

        //infinite loop
//        while(true){
//            System.out.println("Forever!!!");
//        }

        String text = "Sample";

        while(text.isEmpty() || text.length()>4){
            System.out.println("!!!");
        }
    }

}
