package Observer_61_DZ;

public class Main {

    public static void main(String[] args) {

        CurrencyExchange exchange = new CurrencyExchange();

        exchange.attach(new MobileObserver());
        exchange.attach(new TraderObserver());
        exchange.attach(new EmailObserver());

        exchange.setRate("USD",470);
        exchange.setRate("USD",480);
    }
}