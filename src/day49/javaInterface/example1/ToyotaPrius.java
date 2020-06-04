package day49.javaInterface.example1;

//to inherit from multiple interfaces just use comma
public class ToyotaPrius implements Electric, Gas {

    @Override
    public String changeBattery() {
        return "change every 12 months";
    }

    @Override
    public String checkEngine() {
        return "change every 7 months";
    }
}
