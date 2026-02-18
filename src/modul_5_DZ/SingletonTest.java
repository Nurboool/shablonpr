package modul_5_DZ;

public class SingletonTest {

    public static void main(String[] args) {

        Runnable task = () -> {
            ConfigurationManager config = ConfigurationManager.getInstance();
            System.out.println("Instance hash: " + config.hashCode());
        };

        for (int i = 0; i < 5; i++)
            new Thread(task).start();
    }
}
