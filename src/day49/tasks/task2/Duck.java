package day49.tasks.task2;

public class Duck implements Flying, Swimming {
    @Override
    public String fly() {
        return "in air";
    }

    @Override
    public String swim() {
        return "river, sea";
    }

    @Override
    public String food() {
        return "grass";
    }
}
