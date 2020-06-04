package day49.javaInterface.example1;

public class TeslaCar implements Electric {

    @Override
    public String changeBattery() {
        return "change every 3 years";
    }

}
