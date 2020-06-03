package day48.tasks.task3;


import day48.tasks.task3.cat.BlackCougar;
import day48.tasks.task3.cat.Cat;
import day48.tasks.task3.cat.Lion;

public class Zoo {

    public static void main(String[] args) {
        Cat tom = new Cat("Tom"); // from tom&jerry
        Cat simba = new Lion("Simba"); // from lion king
        Cat baghira = new BlackCougar("Baghira"); //from jungle book

        System.out.println(tom);
        System.out.println(simba);
        System.out.println(baghira);

    }
}
