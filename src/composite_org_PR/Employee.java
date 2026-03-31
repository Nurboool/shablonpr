package composite_org_PR;

public class Employee extends OrganizationComponent {

    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        super(name);
        this.position = position;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display(String indent) {
        System.out.println(indent + name + " (" + position + ") $" + salary);
    }

    public double getBudget() {
        return salary;
    }

    public int getEmployeeCount() {
        return 1;
    }
}