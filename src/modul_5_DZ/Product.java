package modul_5_DZ;

public class Product implements Cloneable {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    @Override
    public Product clone() {
        return new Product(name, price, quantity);
    }
}
