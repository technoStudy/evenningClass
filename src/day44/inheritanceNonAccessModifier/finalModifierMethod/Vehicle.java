package day44.inheritanceNonAccessModifier.finalModifierMethod;

public class Vehicle {


    //final methods cannot be overridden/modified
    public final void print() {
        System.out.println("Vehicle print()");
    }
}
