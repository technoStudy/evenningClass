public class ex {
    public static void main(String[] args) {
        int a = 0111;
        int e = 01_1;

        System.out.println(e);
    }

    public void run(){
        throw new RuntimeException("me");
    }

    public void run2() throws Exception {
        throw new Exception("me");
    }
}
