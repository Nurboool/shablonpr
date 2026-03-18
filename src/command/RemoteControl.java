package command;

import java.util.Stack;

public class RemoteControl {

    private Stack<Command> history = new Stack<>();

    public void pressButton(Command command) {

        if (command == null) {
            System.out.println("No command assigned");
            return;
        }

        command.execute();
        history.push(command);
    }

    public void undo() {

        if (history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Command command = history.pop();
        command.undo();
    }
}