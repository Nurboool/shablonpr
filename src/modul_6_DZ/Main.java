package modul_6_DZ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ================= STRATEGY =================
        System.out.println("=== STRATEGY PATTERN (Оплата) ===");

        PaymentContext context = new PaymentContext();

        System.out.print("Введите сумму оплаты: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // буферді тазалау

        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - Банковская карта");
        System.out.println("2 - PayPal");
        System.out.println("3 - Криптовалюта");
        System.out.print("Ваш выбор: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.print("Введите номер карты: ");
                String card = scanner.nextLine();
                context.setStrategy(new CreditCardPayment(card));
                break;

            case "2":
                System.out.print("Введите email PayPal: ");
                String email = scanner.nextLine();
                context.setStrategy(new PayPalPayment(email));
                break;

            case "3":
                System.out.print("Введите адрес крипто-кошелька: ");
                String wallet = scanner.nextLine();
                context.setStrategy(new CryptoPayment(wallet));
                break;

            default:
                System.out.println("Неверный выбор! Завершение программы.");
                scanner.close();
                return;
        }

        context.executePayment(amount);

        // ================= OBSERVER =================
        System.out.println("\n=== OBSERVER PATTERN (Currency Exchange) ===\n");

        CurrencyExchange exchange = new CurrencyExchange();

        IObserver mobile = new MobileAppObserver("Мобильное приложение");
        IObserver emailObserver = new EmailObserver("example@mail.com");
        IObserver trader = new TraderObserver("Трейдер");

        // Подписка
        exchange.attach(mobile);
        exchange.attach(emailObserver);
        exchange.attach(trader);

        // Обновление курсов
        exchange.setRate("USD", 470);
        exchange.setRate("EUR", 510);

        // Удаляем одного наблюдателя
        exchange.detach(emailObserver);

        System.out.println("\nПосле удаления EmailObserver:\n");

        exchange.setRate("USD", 480);

        scanner.close();
    }
}