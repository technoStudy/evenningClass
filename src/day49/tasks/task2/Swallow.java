package day49.tasks.task2;

public class Swallow implements Flying {
    @Override
    public String fly() {
        return "in air";
    }

    @Override
    public String food() {
        return "insects";
    }
}
