package modul_6_pr;

import java.util.*;
import java.util.concurrent.*;

public class StockExchange implements ISubject {

    private Map<String, List<IObserver>> observers = new ConcurrentHashMap<>();
    private Map<String, Double> stocks = new ConcurrentHashMap<>();

    @Override
    public void subscribe(String stock, IObserver observer) {
        observers.computeIfAbsent(stock, k -> new ArrayList<>()).add(observer);
        System.out.println(observer.getName() + " subscribed to " + stock);
    }

    @Override
    public void unsubscribe(String stock, IObserver observer) {
        if (observers.containsKey(stock))
            observers.get(stock).remove(observer);
    }

    @Override
    public void notifyObservers(String stock, double price) {
        if (!observers.containsKey(stock)) return;

        for (IObserver observer : observers.get(stock)) {
            CompletableFuture.runAsync(() -> observer.update(stock, price));
        }
    }

    public void updateStock(String stock, double price) {
        stocks.put(stock, price);
        System.out.println("Stock updated: " + stock + " = " + price);
        notifyObservers(stock, price);
    }
}