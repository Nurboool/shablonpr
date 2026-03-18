package mediator;

public class User implements IUser {

    private String name;
    private IMediator mediator;

    public User(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void send(String message, String channel) {
        mediator.sendMessage(message, this, channel);
    }

    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}