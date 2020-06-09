package day51.tasks.task1.device.phone;

import day51.tasks.task1.device.AbstractDevice;
import day51.tasks.task1.device.Carrier;

public abstract class AbstractPhone extends AbstractDevice {
    private Carrier carrier;

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncarrier: " + carrier;
    }
}
