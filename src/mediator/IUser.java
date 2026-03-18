package mediator;

public interface IUser {

    void send(String message, String channel);

    void receive(String message);

    String getName();
}