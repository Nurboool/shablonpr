package modul_6_pr;

public interface IObserver {
    void update(String stock, double price);
    String getName();
}