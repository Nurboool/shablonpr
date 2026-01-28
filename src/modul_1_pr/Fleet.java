package modul_1_pr;
import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Garage> garages = new ArrayList<>();

    public void addGarage(Garage garage) {
        garages.add(garage);
        System.out.println("Гараж қосылды: " + garage.getName());
    }

    public void removeGarage(Garage garage) {
        garages.remove(garage);
        System.out.println("Гараж алынды: " + garage.getName());
    }

    public Vehicle findVehicleByModel(String model) {
        for (Garage garage : garages) {
            for (Vehicle vehicle : garage.getVehicles()) {
                if (vehicle.toString().contains(model)) {
                    return vehicle;
                }
            }
        }
        return null;
    }
}
