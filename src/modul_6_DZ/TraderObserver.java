package modul_6_DZ;

public class TraderObserver implements IObserver {

    private String traderName;

    public TraderObserver(String traderName) {
        this.traderName = traderName;
    }

    @Override
    public void update(String currency, double rate) {
        if (rate > 475) {
            System.out.println(traderName + ": Пора продавать " + currency + "!");
        } else {
            System.out.println(traderName + ": Пора покупать " + currency + "!");
        }
    }
}