package moduul_3_pr;


public class EmailNotification implements INotification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}

