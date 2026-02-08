package modul_3_DZ;


public class OrderPriceCalculator {
    public double calculateTotalPrice(Order order) {
        // 10% discount
        return order.getQuantity() * order.getPrice() * 0.9;
    }
}
