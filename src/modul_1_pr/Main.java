package modul_1_pr;


public class Main {

    public static void main(String[] args) {


        Vehicle car = new Car("Toyota", "Camry", 2022, 4, "Automatic");
        Vehicle motorcycle = new Motorcycle("Yamaha", "R6", 2021, "Sport", false);


        Garage garage1 = new Garage("Орталық гараж");
        Garage garage2 = new Garage("Жеке гараж");


        Fleet fleet = new Fleet();

        fleet.addGarage(garage1);
        fleet.addGarage(garage2);

        garage1.addVehicle(car);
        garage2.addVehicle(motorcycle);

        car.startEngine();
        motorcycle.startEngine();


        Vehicle found = fleet.findVehicleByModel("Camry");
        if (found != null) {
            System.out.println("Табылды: " + found);
        } else {
            System.out.println("Транспорт табылмады");
        }

        garage1.removeVehicle(car);
        fleet.removeGarage(garage2);
    }
}

