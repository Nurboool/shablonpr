package Observer_61_DZ;

public class TraderObserver implements IObserver {

    public void update(String currency, double rate) {

        if(rate > 470)
            System.out.println("Trader: продаем " + currency);
        else
            System.out.println("Trader: покупаем " + currency);
    }
}