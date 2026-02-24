package modul_6_pr;

public class Trader implements IObserver {

    private String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock, double price) {
        System.out.println("Trader " + name +
                " notified: " + stock + " price = " + price);
    }

    @Override
    public String getName() {
        return name;
    }
}