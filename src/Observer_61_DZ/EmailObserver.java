package Observer_61_DZ;

public class EmailObserver implements IObserver {

    public void update(String currency, double rate) {
        System.out.println("Email notification: курс " + currency + " = " + rate);
    }
}
