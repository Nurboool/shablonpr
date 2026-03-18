package Strategy_61_DZ;

public class CryptoPayment implements IPaymentStrategy {

    public void pay(double amount) {
        System.out.println("Оплата " + amount + " криптовалютой");
    }
}