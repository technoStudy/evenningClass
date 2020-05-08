package day32.nonAccessModifier.finalModifier;

/*
final
methods cannot be overridden
variable can be initialized only once

 */
public class JavaFinalModifier {

    public final String name = "Lui";

    public static void main(String[] args) {
        JavaFinalModifier jfm = new JavaFinalModifier();
        System.out.println("Name: " + jfm.name);

        // final field cannot be reassigned after been initialized
        // jfm.name = "Finess";
    }
}
