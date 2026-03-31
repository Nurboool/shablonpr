package composite_org_PR;

public abstract class OrganizationComponent {

    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public void add(OrganizationComponent c) {}
    public void remove(OrganizationComponent c) {}

    public abstract void display(String indent);
    public abstract double getBudget();
    public abstract int getEmployeeCount();
}