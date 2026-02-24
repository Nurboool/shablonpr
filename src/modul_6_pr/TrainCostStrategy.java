package modul_6_pr;

public class TrainCostStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {

        double baseRate = 0.3;
        double cost = request.distance * baseRate;

        if (request.serviceClass == ServiceClass.BUSINESS)
            cost *= 1.4;

        if (request.transfer)
            cost += 40;

        cost *= request.passengers;

        return applyDiscount(cost, request.discountType);
    }

    private double applyDiscount(double cost, DiscountType type) {
        switch (type) {
            case CHILD: return cost * 0.8;
            case PENSIONER: return cost * 0.85;
            default: return cost;
        }
    }
}