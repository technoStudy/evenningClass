package day50.tasks.task2.food;

public interface Food {

    String taste();


    //print how it taste
    default void print() {
        System.out.println("food taste: " + taste());
    }


}
