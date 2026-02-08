package modul_3_DZ;


public class Main {
    public static void main(String[] args) {

        // SRP demo
        Order order = new Order("Laptop", 2, 1000);
        OrderPriceCalculator calc = new OrderPriceCalculator();
        System.out.println("Total: " + calc.calculateTotalPrice(order));
        new PaymentService().processPayment("VISA");
        new OrderNotificationService().sendConfirmationEmail("user@mail.com");

        // OCP demo
        Employee emp = new Employee("Aruzhan", 2000);
        SalaryCalculator salaryCalc = new PermanentEmployeeSalary();
        System.out.println("Salary: " + salaryCalc.calculateSalary(emp));

        // ISP demo
        Printer basic = new BasicPrinter();
        basic.print("Doc");

        AllInOnePrinter aio = new AllInOnePrinter();
        aio.print("Doc");
        aio.scan("Doc");
        aio.fax("Doc");

        // DIP demo
        NotificationService nsEmail = new NotificationService(new EmailSender());
        nsEmail.sendNotification("Hello via Email");

        NotificationService nsSms = new NotificationService(new SmsSender());
        nsSms.sendNotification("Hello via SMS");
    }
}
