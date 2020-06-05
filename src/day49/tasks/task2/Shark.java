package day49.tasks.task2;

public class Shark implements Swimming {

    @Override
    public String swim() {
        return "sea, ocean";
    }

    @Override
    public String food() {
        return "fish";
    }
}
