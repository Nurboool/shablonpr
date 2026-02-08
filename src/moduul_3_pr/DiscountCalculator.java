package moduul_3_pr;

import java.util.ArrayList;
import java.util.List;

public class DiscountCalculator {
    private final List<DiscountRule> rules = new ArrayList<>();

    public void addRule(DiscountRule rule) {
        rules.add(rule);
    }

    public double applyDiscounts(double amount) {
        double result = amount;
        for (DiscountRule rule : rules) {
            result = rule.apply(result);
        }
        return result;
    }
}

