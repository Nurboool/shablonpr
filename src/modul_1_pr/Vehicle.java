package modul_1_pr;

public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println(brand + " " + model + " қозғалтқышы іске қосылды");
    }

    public void stopEngine() {
        System.out.println(brand + " " + model + " қозғалтқышы тоқтатылды");
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}
