package mediator;

public class Main {

    public static void main(String[] args) {

        IMediator mediator = new ChatMediator();

        IUser user1 = new User("Alice", mediator);
        IUser user2 = new User("Bob", mediator);
        IUser user3 = new User("Charlie", mediator);

        mediator.addUser(user1, "general");
        mediator.addUser(user2, "general");
        mediator.addUser(user3, "tech");

        user1.send("Hello!", "general");
        user2.send("Hi!", "general");
    }
}