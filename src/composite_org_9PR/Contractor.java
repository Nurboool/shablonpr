package composite_org_9PR;

public class Contractor extends OrganizationComponent {

    private double payment;

    public Contractor(String name, double payment) {
        super(name);
        this.payment = payment;
    }

    public void display(String indent) {
        System.out.println(indent + name + " (Contractor) $" + payment);
    }

    public double getBudget() {
        return 0;
    }

    public int getEmployeeCount() {
        return 1;
    }
}