package moduul_3_pr;


public class PostDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Post delivery arranged.");
    }
}
