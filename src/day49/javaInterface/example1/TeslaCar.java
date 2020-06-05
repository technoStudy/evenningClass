package day49.javaInterface.example1;

public class TeslaCar extends AbstractVehicle implements Electric {

    @Override
    public String changeBattery() {

        return "change every 3 years" + Electric.batteryLife;
    }

}
