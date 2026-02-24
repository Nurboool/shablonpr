package modul_6_pr;

public class BusCostStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {

        double baseRate = 0.2;
        double cost = request.distance * baseRate;

        if (request.extraBaggage)
            cost += 20;

        cost *= request.passengers;

        return applyDiscount(cost, request.discountType);
    }

    private double applyDiscount(double cost, DiscountType type) {
        switch (type) {
            case CHILD: return cost * 0.85;
            case PENSIONER: return cost * 0.9;
            default: return cost;
        }
    }
}