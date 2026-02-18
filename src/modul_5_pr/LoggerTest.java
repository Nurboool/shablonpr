package modul_5_pr;

public class LoggerTest {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.loadConfig("logger.properties");

        Runnable task = () -> {
            Logger log = Logger.getInstance();

            for (int i = 0; i < 5; i++) {
                log.log("Thread " + Thread.currentThread().getName(), LogLevel.INFO);
                log.log("Warning event", LogLevel.WARNING);
                log.log("Error event", LogLevel.ERROR);
            }
        };

        for (int i = 0; i < 3; i++)
            new Thread(task).start();
    }
}
