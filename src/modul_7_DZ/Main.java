package modul_7_DZ;

public class Main {

    public static void main(String[] args) {

        // COMMAND
        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat();

        Invoker invoker = new Invoker();

        invoker.executeCommand(new LightOnCommand(light));
        invoker.executeCommand(new DoorOpenCommand(door));
        invoker.executeCommand(new TempUpCommand(thermostat));

        invoker.undo();

        // TEMPLATE METHOD
        System.out.println("\nTea:");
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\nCoffee:");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

        // MEDIATOR
        ChatRoom chat = new ChatRoom();

        User u1 = new User("Ali", chat);
        User u2 = new User("Dana", chat);
        User u3 = new User("Arman", chat);

        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);

        u1.send("Hello everyone!");
    }
}