package day47.tasks.task1;

public class IceCream extends Food {

    @Override
    public String taste() {
        return "sweet";
    }

    @Override
    public boolean edible() {
        return true;
    }

    @Override
    public boolean isDesert() {
        return true;
    }
}
