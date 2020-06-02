package day47.tasks.task1;

public class Baklava extends Food {

    @Override
    public String taste() {
        return "very good, delicious, sweet";
    }

    @Override
    public boolean edible() {
        return true;
    }

    @Override
    public boolean isDesert() {
        return true;
    }

    public String serve() {
        return "serve with Turkish tea";
    }

}
