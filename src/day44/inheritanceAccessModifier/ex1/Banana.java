package day44.inheritanceAccessModifier.ex1;

import day44.inheritanceAccessModifier.Fruit;

public class Banana extends Fruit {

    public void print(){
        System.out.println(this.a);
        System.out.println(this.b);
        //System.out.println(this.c); //c is package private
        //System.out.println(this.d); //d is private, cant inherit

    }
}
