package day51.tasks.task1.device;

import day51.tasks.task1.device.laptop.AbstractLaptop;

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
        String info = "\n---" + this.getClass().getSimpleName() +"---"+
                "\nmodel: " + this.model +
                "\nprice: " + this.price +
                "\ncondition: " + this.condition;

        if(this instanceof AbstractLaptop){
            AbstractLaptop laptop = (AbstractLaptop) this;
            info += "\nCPU: " + laptop.getCPU();
            info += "\nRAM: " + laptop.getRAM();
            info += "\nDisplay: " + laptop.getDisplayType();
        }



        return info;
    }
}
