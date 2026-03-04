package modul_7_pr;

import java.util.*;

public class ChatMediator implements IMediator {

    private Map<String, List<IUser>> channels = new HashMap<>();

    public void addUser(IUser user, String channel) {

        channels.putIfAbsent(channel, new ArrayList<>());
        channels.get(channel).add(user);

        System.out.println(user.getName() + " joined channel " + channel);
    }

    public void sendMessage(String message, IUser sender, String channel) {

        if (!channels.containsKey(channel)) {
            System.out.println("Channel does not exist");
            return;
        }

        for (IUser user : channels.get(channel)) {

            if (user != sender)
                user.receive(sender.getName() + ": " + message);
        }
    }
}