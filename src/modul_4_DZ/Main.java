package modul_4_DZ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose vehicle type: car, motorcycle, truck, bus");
        String type = scanner.nextLine().toLowerCase();

        VehicleFactory factory = null;

        switch (type) {

            case "car":
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();

                System.out.print("Enter model: ");
                String model = scanner.nextLine();

                System.out.print("Enter fuel type: ");
                String fuel = scanner.nextLine();

                factory = new CarFactory(brand, model, fuel);
                break;

            case "motorcycle":
                System.out.print("Enter type (sport/tourist): ");
                String mType = scanner.nextLine();

                System.out.print("Enter engine volume (cc): ");
                int volume = scanner.nextInt();

                factory = new MotorcycleFactory(mType, volume);
                break;

            case "truck":
                System.out.print("Enter load capacity (tons): ");
                double capacity = scanner.nextDouble();

                System.out.print("Enter number of axles: ");
                int axles = scanner.nextInt();

                factory = new TruckFactory(capacity, axles);
                break;

            case "bus":
                System.out.print("Enter passenger capacity: ");
                int passengers = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter fuel type: ");
                String busFuel = scanner.nextLine();

                factory = new BusFactory(passengers, busFuel);
                break;

            default:
                System.out.println("Invalid vehicle type.");
                System.exit(0);
        }

        IVehicle vehicle = factory.createVehicle();
        vehicle.drive();
        vehicle.refuel();

        scanner.close();
    }
}
