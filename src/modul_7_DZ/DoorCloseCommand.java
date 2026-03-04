package modul_7_DZ;

public class DoorCloseCommand implements ICommand {

    private Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.close();
    }

    public void undo() {
        door.open();
    }
}