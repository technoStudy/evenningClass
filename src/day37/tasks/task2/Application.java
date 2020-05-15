package day37.tasks.task2;

import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        CarPurchase carPurchase = new CarPurchase();

        try {
            carPurchase.buy(Condition.NEW);
        } catch(IOException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Try your luck next time");
        }



        carPurchase.drive("meteor shower");
    }
}
