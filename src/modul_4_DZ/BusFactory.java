package modul_4_DZ;

public class BusFactory extends VehicleFactory {

    private int passengerCapacity;
    private String fuelType;

    public BusFactory(int passengerCapacity, String fuelType) {
        this.passengerCapacity = passengerCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public IVehicle createVehicle() {
        return new Bus(passengerCapacity, fuelType);
    }
}
