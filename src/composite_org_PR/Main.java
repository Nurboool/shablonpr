package composite_org_PR;

public class Main {

    public static void main(String[] args) {

        Department root = new Department("Company");

        Employee e1 = new Employee("Ali", "Dev", 1000);
        Employee e2 = new Employee("Sara", "Manager", 2000);

        Contractor c1 = new Contractor("Temp", 500);

        Department sub = new Department("IT");

        sub.add(e1);
        sub.add(c1);

        root.add(sub);
        root.add(e2);

        root.display("");

        System.out.println("Total budget: " + root.getBudget());
        System.out.println("Total employees: " + root.getEmployeeCount());

        root.findEmployee("Ali");
    }
}