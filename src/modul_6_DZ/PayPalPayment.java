package modul_6_DZ;

public class PayPalPayment implements IPaymentStrategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + "₸ через PayPal (" + email + ") выполнена.");
    }
}