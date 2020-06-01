package day47.tasks.task1;

public class Beshparmak extends Food {

    @Override
    public String taste() {
        return "best food ever";
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
