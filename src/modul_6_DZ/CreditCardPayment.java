package modul_6_DZ;

public class CreditCardPayment implements IPaymentStrategy {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + "₸ банковской картой " + cardNumber + " выполнена.");
    }
}