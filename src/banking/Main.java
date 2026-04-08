package banking;

public class Main {
    public static void main(String[] args) {

        //   пайдаланушы интерфейсі
        Frontend frontend = new Frontend();

        //   негізгі логика
        Backend backend = new Backend();

        //  Қосымша компоненттер
        Database database = new Database();
        AuthService authService = new AuthService();
        PaymentGateway paymentGateway = new PaymentGateway();
        NotificationService notificationService = new NotificationService();
        AnalyticsModule analytics = new AnalyticsModule();
        MonitoringSystem monitoring = new MonitoringSystem();

        // 1. Логин процесі
        System.out.println("=== LOGIN PROCESS ===");
        frontend.sendRequest();

        boolean isAuth = authService.login("user", "1234");

        if (isAuth) {
            System.out.println("Login successful ");

            //  2. Ақша аудару
            System.out.println("\n=== PAYMENT PROCESS ===");
            backend.processRequest();
            paymentGateway.processPayment();

            //  3. Дерек сақтау
            database.saveData();

            //  4. Хабарлама жіберу
            notificationService.sendNotification();

            //  5. Аналитика
            analytics.generateReport();

        } else {
            System.out.println("Login failed ");
        }

        //  6. Мониторинг (әрқашан жұмыс істейді)
        System.out.println("\n=== SYSTEM MONITORING ===");
        monitoring.monitor();

        System.out.println("\nBanking system finished ");
    }
}