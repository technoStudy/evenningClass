package day44.inheritanceAccessModifier.ex2;

import day44.inheritanceAccessModifier.Fruit;

public class Strawberry extends Fruit {
    public void print(){
        System.out.println(this.a);
        System.out.println(this.b);
        //System.out.println(this.c); //c has default access modifier
        //System.out.println(this.d); //d is private, cant inherit
    }
}
