package modul_1_pr;

public class Car extends Vehicle {

    private int doorCount;
    private String transmissionType;

    public Car(String brand, String model, int year,
               int doorCount, String transmissionType) {
        super(brand, model, year);
        this.doorCount = doorCount;
        this.transmissionType = transmissionType;
    }

    @Override
    public void startEngine() {
        System.out.println("Автокөлік " + brand + " " + model +
                " іске қосылды (трансмиссия: " + transmissionType + ")");
    }
}

