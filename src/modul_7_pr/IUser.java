package modul_7_pr;

public interface IUser {
    void send(String message, String channel);
    void receive(String message);
    String getName();
}