package modul_2_DZ;


public class Logger {

    public enum LogLevel {
        ERROR, WARNING, INFO
    }

    public static void log(LogLevel level, String message) {
        System.out.println(level + ": " + message);
    }
}
