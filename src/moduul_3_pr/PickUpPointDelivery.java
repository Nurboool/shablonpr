package moduul_3_pr;


public class PickUpPointDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Ready at pickup point.");
    }
}
