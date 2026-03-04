package modul_7_DZ;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IMediator {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {

        users.add(user);
        System.out.println(user.getName() + " joined the chat");
    }

    public void sendMessage(String message, User sender) {

        for(User user : users) {

            if(user != sender)
                user.receive(message);
        }
    }
}