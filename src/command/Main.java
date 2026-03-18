package command;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();
        TV tv = new TV();
        AirConditioner ac = new AirConditioner();

        RemoteControl remote = new RemoteControl();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        remote.pressButton(lightOn);
        remote.pressButton(lightOff);

        remote.undo();

        MacroCommand macro = new MacroCommand(
                Arrays.asList(
                        new LightOnCommand(light),
                        new LightOnCommand(light)
                )
        );

        remote.pressButton(macro);
    }
}