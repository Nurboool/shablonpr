package modul_6_pr;

public class TradingRobot implements IObserver {

    private String name;
    private double threshold;

    public TradingRobot(String name, double threshold) {
        this.name = name;
        this.threshold = threshold;
    }

    @Override
    public void update(String stock, double price) {

        if (price < threshold)
            System.out.println("Robot " + name + ": BUY " + stock);
        else
            System.out.println("Robot " + name + ": SELL " + stock);
    }

    @Override
    public String getName() {
        return name;
    }
}