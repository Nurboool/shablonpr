package modul_5_DZ;

public class Discount implements Cloneable {

    private double percent;

    public Discount(double percent) {
        this.percent = percent;
    }

    public double apply(double amount) {
        return amount * (1 - percent);
    }

    @Override
    public Discount clone() {
        return new Discount(percent);
    }
}
