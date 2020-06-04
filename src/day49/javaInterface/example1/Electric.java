package day49.javaInterface.example1;

public interface Electric {
    //TODO fields are 'public static final' by default
    public static final int batteryLife = 100;

    //cannot create constructor
    //public Electric(){}

    //non-abstract with body are not allowed
    //public void print(){}

    //TODO methods are 'public abstract' by default
    public abstract String changeBattery();

    //TODO create static methods
    public static void type(){
        System.out.println("Electric car");
    }

}
