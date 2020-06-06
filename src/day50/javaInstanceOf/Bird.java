package day50.javaInstanceOf;

interface Animal{}
interface Food{}

public class Bird implements Animal{

    public static void main(String[] args) {
        Bird bird = new Bird();

        System.out.println("bird is instance of Bird: " + (bird instanceof Bird));
        System.out.println("bird is instance of Animal: " + (bird instanceof Animal));
        System.out.println("bird is instance of Object: " + (bird instanceof Object));
        System.out.println("bird is instance of Food: " + (bird instanceof Food));


    }
}
