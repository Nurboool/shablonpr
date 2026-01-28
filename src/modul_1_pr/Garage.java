package modul_1_pr;
import java.util.ArrayList;
import java.util.List;

public class Garage {

    private String name;
    private List<Vehicle> vehicles = new ArrayList<>();

    public Garage(String name) {
        this.name = name;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle + " гаражға қосылды: " + name);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        System.out.println(vehicle + " гараждан алынды: " + name);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public String getName() {
        return name;
    }
}

