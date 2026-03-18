package Observer_61_DZ;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements ISubject {

    private List<IObserver> observers = new ArrayList<>();

    public void attach(IObserver observer) {
        observers.add(observer);
    }

    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String currency, double rate) {

        for(IObserver observer : observers)
            observer.update(currency, rate);
    }

    public void setRate(String currency, double rate) {

        System.out.println("Новый курс " + currency + ": " + rate);
        notifyObservers(currency, rate);
    }
}