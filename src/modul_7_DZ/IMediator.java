package modul_7_DZ;

public interface IMediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}