package day48.tasks.task3;

public abstract class AbstractAnimal {

    private String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public abstract String sound();

    @Override
    public String toString() {

        return "\n" + super.getClass().getSimpleName() +
                "\nname: " + name +
                "\nsound: " + sound();
    }
}
