package moduul_3_pr;


public class CourierDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Courier delivery arranged.");
    }
}
