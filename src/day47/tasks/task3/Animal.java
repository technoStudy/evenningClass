package day47.tasks.task3;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String food();

    public abstract int sleep();

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +
                "\nname: " + getName() +
                "\nfood: " + food() +
                "\nsleep: " + sleep();
    }
}
