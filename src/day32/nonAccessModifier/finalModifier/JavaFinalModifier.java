package day32.nonAccessModifier.finalModifier;

/*
final
Attributes and methods cannot be overridden/modified

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
