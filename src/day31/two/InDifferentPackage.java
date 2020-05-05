package day31.two;

//import day31.one.DefaultModifierClass;
import day31.one.PublicModifierClass;

public class InDifferentPackage {

    public static void main(String[] args) {
        PublicModifierClass pm = new PublicModifierClass();

        //package-private class cannot be accessed from different package
        //DefaultModifierClass dm = new DefaultModifierClass();
    }
}
