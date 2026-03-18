package Observer_61_DZ;

public interface ISubject {

    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers(String currency, double rate);
}
