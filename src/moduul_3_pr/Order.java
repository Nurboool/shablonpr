package moduul_3_pr;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderItem> items = new ArrayList<>();
    private IPayment paymentMethod;
    private IDelivery deliveryMethod;

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDeliveryMethod(IDelivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public double calculateSubtotal() {
        return items.stream().mapToDouble(OrderItem::getTotal).sum();
    }

    public void pay(double amount) {
        paymentMethod.processPayment(amount);
    }

    public void deliver() {
        deliveryMethod.deliverOrder(this);
    }
}
