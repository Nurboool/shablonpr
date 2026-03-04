package modul_7_pr;

public interface IMediator {
    void sendMessage(String message, IUser sender, String channel);
    void addUser(IUser user, String channel);
}