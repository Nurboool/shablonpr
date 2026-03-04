package modul_7_pr;

public class RemoteControl {

    private ICommand[] onCommands;
    private ICommand[] offCommands;
    private ICommand lastCommand;

    public RemoteControl() {

        onCommands = new ICommand[5];
        offCommands = new ICommand[5];

        ICommand noCommand = new NoCommand();

        for (int i = 0; i < 5; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        lastCommand = noCommand;
    }

    public void setCommand(int slot, ICommand on, ICommand off) {
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    public void pressOn(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void pressOff(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void undo() {
        lastCommand.undo();
    }
}