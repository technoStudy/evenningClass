package day44.inheritanceAccessModifier;

public class Apple extends Fruit {

    public void print(){
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
        //System.out.println(this.d); d is private, cant inherit

    }
}
