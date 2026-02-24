package modul_6_DZ;

public interface ISubject {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers(String currency, double rate);
}