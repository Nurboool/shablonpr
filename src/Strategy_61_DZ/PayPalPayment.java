package Strategy_61_DZ;

public class PayPalPayment implements IPaymentStrategy {

    public void pay(double amount) {
        System.out.println("Оплата " + amount + " через PayPal");
    }
}