package composite_org_PR;

import java.util.*;

public class Department extends OrganizationComponent {

    private List<OrganizationComponent> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void add(OrganizationComponent c) {

        if (!children.contains(c)) {
            children.add(c);
        } else {
            System.out.println("Already exists");
        }
    }

    public void remove(OrganizationComponent c) {

        if (children.contains(c)) {
            children.remove(c);
        } else {
            System.out.println("Not found");
        }
    }

    public void display(String indent) {

        System.out.println(indent + "Department: " + name);

        for (OrganizationComponent c : children) {
            c.display(indent + "   ");
        }
    }

    public double getBudget() {

        double total = 0;

        for (OrganizationComponent c : children) {
            total += c.getBudget();
        }

        return total;
    }

    public int getEmployeeCount() {

        int total = 0;

        for (OrganizationComponent c : children) {
            total += c.getEmployeeCount();
        }

        return total;
    }

    // 🔍 поиск
    public void findEmployee(String name) {

        for (OrganizationComponent c : children) {

            if (c.name.equals(name)) {
                c.display("Found: ");
            }

            if (c instanceof Department) {
                ((Department) c).findEmployee(name);
            }
        }
    }
}