package day48.tasks.task1;

public abstract class AbstractVehicle {

    private long id;
    private String name;
    private GasType gasType;
    private int capacity;


    public abstract double speed();

    public abstract int wheelNumber();



    @Override
    public String toString() {
        return "\n"+getClass().getSimpleName() +
                "\nid: " + id +
                "\nname: " + name +
                "\ngasType: " + gasType +
                "\ncapacity: " + capacity +
                "\nspeed: " + speed() +
                "\nwheels: " + wheelNumber()
                ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GasType getGasType() {
        return gasType;
    }

    public void setGasType(GasType gasType) {
        this.gasType = gasType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
