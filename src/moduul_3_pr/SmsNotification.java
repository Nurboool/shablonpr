package moduul_3_pr;



public class SmsNotification implements INotification {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}
