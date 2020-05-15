package day37.tasks.task2;

import java.io.IOException;

enum Condition {
    NEW, OLD;

}

public class CarPurchase {

    /*
    1. create method 'buy' with enum parameter as conditions of car(NEW, OLD),
    and throws checked/expected exception if its old
    */
    public void buy(Condition condition) throws IOException {
        if(condition == Condition.OLD) {
            throw new IOException("it is old car, dont buy it!!!");
        }

        System.out.println("Congrats with new car!!!");
    }


    /*
    2. create method 'drive' with String parameter as weather,
    and throws unchecked/runtime exception if weather is not "normal"
     */
    public void drive(String weather) {
        if(!weather.equalsIgnoreCase("normal")) {
            throw new RuntimeException("cant drive right now, bad weather");
        }

        System.out.println("Driving to sunset");
    }
}
