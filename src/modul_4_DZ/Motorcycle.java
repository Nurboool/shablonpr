package modul_4_DZ;

public class Motorcycle implements IVehicle {

    private String type;
    private int engineVolume;

    public Motorcycle(String type, int engineVolume) {
        this.type = type;
        this.engineVolume = engineVolume;
    }

    @Override
    public void drive() {
        System.out.println(type + " motorcycle is driving.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling motorcycle (engine: " + engineVolume + "cc)");
    }
}
