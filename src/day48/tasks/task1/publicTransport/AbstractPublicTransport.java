package day48.tasks.task1.publicTransport;

import day48.tasks.task1.AbstractVehicle;

public abstract class AbstractPublicTransport extends AbstractVehicle {

    public abstract double transportationFee();


    @Override
    public String toString() {
        return super.toString() +
                "\ntransportation fee: " + transportationFee()
                ;
    }
}
