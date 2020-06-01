package day47.tasks.task1;

public class SezarSalad extends Food {

    @Override
    public String taste() {
        return "fresh, salty";
    }

    @Override
    public boolean edible() {
        return true;
    }

    @Override
    public boolean isDesert() {
        return false;
    }
}
