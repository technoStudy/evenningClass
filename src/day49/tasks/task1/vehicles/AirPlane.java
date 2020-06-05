package day49.tasks.task1.vehicles;

import day49.tasks.task1.interfaces.Flying;
import day49.tasks.task1.interfaces.Vehicle;

public class AirPlane implements Flying {
    private int altitude;

    @Override
    public int speed() {
        return 575; // m/h
    }

    @Override
    public String fly() {
        if(altitude > Flying.maxAltitude) {
            throw new RuntimeException("Cannot fly higher");
        }

        return "TROPOSPHERE";
    }

}
