package moduul_3_pr;


public class PayPalPayment implements IPayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid via PayPal: " + amount);
    }
}
