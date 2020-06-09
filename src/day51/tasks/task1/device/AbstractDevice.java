package day51.tasks.task1.device;

public class AbstractDevice implements Product {

    private String model;
    private double price;
    private Condition condition;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +
                "\nmodel: " + model +
                "\nprice: " + price +
                "\ncondition: " + condition;
    }
}
