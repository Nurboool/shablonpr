package Observer_61_DZ;

public class MobileObserver implements IObserver {

    public void update(String currency, double rate) {
        System.out.println("Mobile app: " + currency + " = " + rate);
    }
}
