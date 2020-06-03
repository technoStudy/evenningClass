package day48.polymorphism;

import day43.superKeyword.ex3.B;

import java.util.ArrayList;
import java.util.List;

public class SweetShop {

    public static void main(String[] args) {
        Food iceCream1 = new IceCream("Marash icecream");
        Food iceCream2 = new IceCream("Chocolate icecream");
        Food baklava1 = new Baklava("havuc dilimi");
        Food baklava2 = new Baklava("antep baklava");

        List<Food> listOfSweet = new ArrayList();
        listOfSweet.add(iceCream1);
        listOfSweet.add(iceCream2);
        listOfSweet.add(baklava1);
        listOfSweet.add(baklava2);

        for(Food food : listOfSweet) {
            System.out.println(food);
        }

//        System.out.println(listOfSweet);

    }

//    public static void part1(){
//        IceCream iceCream1 = new IceCream();
//        iceCream1.setName("Marash icecream");
//
//        IceCream iceCream2 = new IceCream();
//        iceCream2.setName("Chocolate icecream");
//
//        Baklava baklava1 = new Baklava();
//        baklava1.setName("havuc dilimi");
//
//        Baklava baklava2 = new Baklava();
//        baklava2.setName("antep baklava");
//    }
//
//    public static void part2(){
//        Sweet iceCream1 = new IceCream();
//        iceCream1.setName("Marash icecream");
//
//        Sweet iceCream2 = new IceCream();
//        iceCream2.setName("Chocolate icecream");
//
//        Sweet baklava1 = new Baklava();
//        baklava1.setName("havuc dilimi");
//
//        Sweet baklava2 = new Baklava();
//        baklava2.setName("antep baklava");
//    }
}
