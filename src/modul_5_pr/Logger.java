package modul_5_pr;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Logger {

    private static volatile Logger instance;
    private LogLevel currentLevel = LogLevel.INFO;
    private String logFile = "app.log";

    private final Object lock = new Object();

    private Logger() { }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null)
                    instance = new Logger();
            }
        }
        return instance;
    }

    public void setLogLevel(LogLevel level) {
        this.currentLevel = level;
    }

    public void loadConfig(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            Properties prop = new Properties();
            prop.load(fis);

            currentLevel = LogLevel.valueOf(prop.getProperty("level", "INFO"));
            logFile = prop.getProperty("file", "app.log");

        } catch (Exception e) {
            System.out.println("Config load error: " + e.getMessage());
        }
    }

    public void log(String message, LogLevel level) {
        if (level.ordinal() < currentLevel.ordinal()) return;

        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        String line = "[" + time + "][" + level + "] " + message;

        synchronized (lock) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
                writer.write(line);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
