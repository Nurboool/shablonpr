package modul_6_pr;

public class PlaneCostStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {

        double baseRate = 0.5;
        double cost = request.distance * baseRate;

        if (request.serviceClass == ServiceClass.BUSINESS)
            cost *= 1.8;

        if (request.extraBaggage)
            cost += 50;

        if (request.transfer)
            cost += 100;

        cost *= request.passengers;

        return cost;
    }
}