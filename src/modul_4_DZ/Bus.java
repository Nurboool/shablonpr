package modul_4_DZ;

public class Bus implements IVehicle {

    private int passengerCapacity;
    private String fuelType;

    public Bus(int passengerCapacity, String fuelType) {
        this.passengerCapacity = passengerCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void drive() {
        System.out.println("Bus carrying " + passengerCapacity + " passengers is driving.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling bus with " + fuelType);
    }
}
