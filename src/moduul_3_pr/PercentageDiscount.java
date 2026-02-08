package moduul_3_pr;

public class PercentageDiscount implements DiscountRule {
    private final double percent; // 0.10 = 10%

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double amount) {
        return amount * (1 - percent);
    }
}
