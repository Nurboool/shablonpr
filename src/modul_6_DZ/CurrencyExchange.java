package modul_6_DZ;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class CurrencyExchange implements ISubject {

    private List<IObserver> observers = new ArrayList<>();
    private Map<String, Double> rates = new HashMap<>();

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String currency, double rate) {
        for (IObserver observer : observers) {
            observer.update(currency, rate);
        }
    }

    public void setRate(String currency, double rate) {
        rates.put(currency, rate);
        System.out.println("Курс " + currency + " обновлен: " + rate);
        notifyObservers(currency, rate);
    }
}