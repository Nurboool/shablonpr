package moduul_3_pr;


public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        order.addItem(new OrderItem("Mouse", 2, 25));
        order.addItem(new OrderItem("Keyboard", 1, 70));

        order.setPaymentMethod(new PayPalPayment());
        order.setDeliveryMethod(new CourierDelivery());

        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.addRule(new PercentageDiscount(0.10));
        discountCalculator.addRule(new ThresholdDiscount(100, 5));

        double subtotal = order.calculateSubtotal();
        double total = discountCalculator.applyDiscounts(subtotal);

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total after discounts: " + total);

        order.pay(total);
        order.deliver();

        OrderStatusService statusService =
                new OrderStatusService(new EmailNotification());
        statusService.notifyStatus("PAID & SHIPPED");
    }
}
