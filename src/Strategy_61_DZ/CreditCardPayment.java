package Strategy_61_DZ;

public class CreditCardPayment implements IPaymentStrategy {

    public void pay(double amount) {
        System.out.println("Оплата " + amount + " картой");
    }
}