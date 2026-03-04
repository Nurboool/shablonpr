package modul_7_pr;

public class Main {

    public static void main(String[] args) {

        // COMMAND
        Light light = new Light();
        AirConditioner ac = new AirConditioner();
        TV tv = new TV();

        RemoteControl remote = new RemoteControl();

        remote.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        remote.setCommand(1, new ACOnCommand(ac), new ACOffCommand(ac));
        remote.setCommand(2, new TVOnCommand(tv), new TVOffCommand(tv));

        remote.pressOn(0);
        remote.pressOff(0);
        remote.undo();

        // TEMPLATE METHOD
        ReportGenerator pdf = new PdfReport();
        pdf.generateReport();

        ReportGenerator excel = new ExcelReport();
        excel.generateReport();

        // MEDIATOR
        ChatMediator mediator = new ChatMediator();

        User u1 = new User("Alice", mediator);
        User u2 = new User("Bob", mediator);

        mediator.addUser(u1, "general");
        mediator.addUser(u2, "general");

        u1.send("Hello!", "general");
    }
}