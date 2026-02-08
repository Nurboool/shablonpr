package modul_4_pr;

public class Invoice implements Document {

    @Override
    public void open() {
        System.out.println("Opening Invoice document...");
    }
}
