package modul_6_pr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ========= STRATEGY =========
        TravelBookingContext context = new TravelBookingContext();

        System.out.println("Select transport: 1-Plane 2-Train 3-Bus");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: context.setStrategy(new PlaneCostStrategy()); break;
            case 2: context.setStrategy(new TrainCostStrategy()); break;
            case 3: context.setStrategy(new BusCostStrategy()); break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        TravelRequest request = new TravelRequest(
                1000,
                ServiceClass.ECONOMY,
                DiscountType.CHILD,
                2,
                true,
                false
        );

        double result = context.calculate(request);
        System.out.println("Total cost: " + result);

        // ========= OBSERVER =========
        StockExchange exchange = new StockExchange();

        Trader trader = new Trader("Alex");
        TradingRobot robot = new TradingRobot("Bot1", 150);

        exchange.subscribe("AAPL", trader);
        exchange.subscribe("AAPL", robot);

        exchange.updateStock("AAPL", 120);
        exchange.updateStock("AAPL", 200);
    }
}