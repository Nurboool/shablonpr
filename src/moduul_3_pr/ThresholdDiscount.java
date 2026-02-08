package moduul_3_pr;

public class ThresholdDiscount implements DiscountRule {
    private final double threshold;
    private final double discountAmount;

    public ThresholdDiscount(double threshold, double discountAmount) {
        this.threshold = threshold;
        this.discountAmount = discountAmount;
    }

    @Override
    public double apply(double amount) {
        return amount >= threshold ? amount - discountAmount : amount;
    }
}
