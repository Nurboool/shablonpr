package university;

public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }

    public void manageSystem() {
        System.out.println("Managing system...");
    }
}