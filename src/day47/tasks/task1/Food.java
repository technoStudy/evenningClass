package day47.tasks.task1;

public abstract class Food {

    public Food() {
        System.out.println("constructor of food");
    }

    public abstract String taste();

    public abstract boolean edible();

    public abstract boolean isDesert();

    @Override
    public String toString() {
        return "taste: " + taste() +
                "edible: " + edible() +
                "desert: " + isDesert()
                ;
    }

    public final void cook() {
        System.out.println("Cooking a food");
    }

    public static void print() {
        System.out.println("Printing food");
    }
}
