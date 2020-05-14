package day37.exceptionThrow;

public class CheckedExample {

    public static void goOutside(int temperature) throws Exception {
        if(temperature < 10) {
            Exception ex = new Exception("It freezing outside, dont go out!!!");
            throw ex;
        }

        System.out.println("Play basketball outside");
    }

    public static void main(String[] args) {
        try {
            goOutside(80);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Play basketball on ps4/pc");
            //e.printStackTrace();
        }


    }
}
