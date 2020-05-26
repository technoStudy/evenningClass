package day43.tasks.task1;

//super/parent class
public class Fruit {
    public String name;

    @Override
    public String toString() {
        return "Fruit:" + getClass().getSimpleName() + " {" +
                " name='" + name + '\'' +
                '}';
    }
}
