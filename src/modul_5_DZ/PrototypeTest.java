package modul_5_DZ;

public class PrototypeTest {

    public static void main(String[] args) {

        Order template = new Order();
        template.addProduct(new Product("Laptop", 1000, 1));
        template.setDiscount(new Discount(0.1));
        template.setDeliveryCost(20);
        template.setPaymentMethod("Card");

        Order newOrder = template.clone();
        newOrder.addProduct(new Product("Mouse", 50, 2));

        System.out.println("Template: " + template);
        System.out.println("Cloned: " + newOrder);
    }
}
