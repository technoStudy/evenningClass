package day51.tasks.task1.device.phone;

import day51.tasks.task1.device.Carrier;
import day51.tasks.task1.device.Product;

public abstract class AbstractPhone implements Product {
    private Carrier carrier;

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }
}
