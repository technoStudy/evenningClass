package day31.classModifiers.one;

public class InSamePackage {

    public static void main(String[] args) {
        PublicModifierClass pm = new PublicModifierClass();

        //package-private class can be accessed within same package
        DefaultModifierClass dm = new DefaultModifierClass();
    }
}
