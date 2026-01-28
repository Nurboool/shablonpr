package modul_1_pr;

public class Motorcycle extends Vehicle {

    private String bodyType;
    private boolean hasBox;

    public Motorcycle(String brand, String model, int year,
                      String bodyType, boolean hasBox) {
        super(brand, model, year);
        this.bodyType = bodyType;
        this.hasBox = hasBox;
    }

    @Override
    public void startEngine() {
        System.out.println("Мотоцикл " + brand + " " + model +
                " іске қосылды (кузов: " + bodyType + ")");
    }
}
