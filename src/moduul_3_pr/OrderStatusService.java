package moduul_3_pr;

public class OrderStatusService {
    private final INotification notification;

    public OrderStatusService(INotification notification) {
        this.notification = notification;
    }

    public void notifyStatus(String status) {
        notification.sendNotification("Order status: " + status);
    }
}
