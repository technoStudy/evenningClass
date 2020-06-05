package day49.javaInterface.example1;

public class CarGallery {

    public static void main(String[] args) {
        option1();
    }

    public static void option1() {
        FordMustang mustang = new FordMustang();
        TeslaCar tesla = new TeslaCar();
        ToyotaPrius toyota = new ToyotaPrius();
    }

    public static void option2() {
        AbstractVehicle mustang = new FordMustang();
        AbstractVehicle tesla = new TeslaCar();
        AbstractVehicle toyota = new ToyotaPrius();
    }

    public static void option3() {
        Gas mustang = new FordMustang();
        Electric tesla = new TeslaCar();
        Electric toyota = new ToyotaPrius();
        Gas toyota2 = new ToyotaPrius();
    }
}
