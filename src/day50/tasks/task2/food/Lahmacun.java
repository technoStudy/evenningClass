package day50.tasks.task2.food;

public class Lahmacun implements Food {

    @Override
    public String taste() {
        return "like easy pizza";
    }

    public String dough() {
        return "dough";
    }

    public String topping() {
        return "meat, tomato";
    }

    public String bake() {
        return "400 F";
    }
}
