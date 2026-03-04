package modul_7_pr;

public class NoCommand implements ICommand {

    public void execute() {
        System.out.println("No command assigned");
    }

    public void undo() {
        System.out.println("Nothing to undo");
    }
}