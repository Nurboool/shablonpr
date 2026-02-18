package modul_5_DZ;

import java.util.ArrayList;
import java.util.List;

public class Order implements Cloneable {

    private List<Product> products = new ArrayList<>();
    private Discount discount;
    private double deliveryCost;
    private String paymentMethod;

    public void addProduct(Product p) { products.add(p); }
    public void setDiscount(Discount discount) { this.discount = discount; }
    public void setDeliveryCost(double deliveryCost) { this.deliveryCost = deliveryCost; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public double total() {
        double sum = products.stream().mapToDouble(Product::getTotal).sum();
        if (discount != null) sum = discount.apply(sum);
        return sum + deliveryCost;
    }

    @Override
    public Order clone() {
        Order copy = new Order();

        for (Product p : products)
            copy.products.add(p.clone());

        if (discount != null)
            copy.discount = discount.clone();

        copy.deliveryCost = deliveryCost;
        copy.paymentMethod = paymentMethod;

        return copy;
    }

    @Override
    public String toString() {
        return "Total: " + total() + " Payment: " + paymentMethod;
    }
}
