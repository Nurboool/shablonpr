package modul_5_pr;

import java.io.BufferedReader;
import java.io.FileReader;

public class LogReader {

    public static void readByLevel(String file, LogLevel level) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("[" + level + "]"))
                    System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
