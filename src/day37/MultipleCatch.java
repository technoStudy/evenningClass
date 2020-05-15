package day37;

public class MultipleCatch {

    public static void main(String[] args) {
        // null, "", "            "
        String text = "hello";

        try {
            char charAt = text.charAt(0);

            int a = 5 / 0;
        } catch(NullPointerException e1) {
            System.out.println("text is null/not existing, please provide valid text");
        } catch(StringIndexOutOfBoundsException e2) {
            System.out.println("text is empty/no characters, please provide valid text");
        } catch(RuntimeException e3) {
            System.out.println("something gone wrong, please check it");
        }

    }
}
