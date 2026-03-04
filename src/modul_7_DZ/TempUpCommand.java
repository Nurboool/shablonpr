package modul_7_DZ;

public class TempUpCommand implements ICommand {

    private Thermostat thermostat;

    public TempUpCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.increase();
    }

    public void undo() {
        thermostat.decrease();
    }
}