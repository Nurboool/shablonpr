package modul_5_DZ;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {

    private static volatile ConfigurationManager instance;
    private Map<String, String> settings = new HashMap<>();

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null)
                    instance = new ConfigurationManager();
            }
        }
        return instance;
    }

    public void set(String key, String value) {
        settings.put(key, value);
    }

    public String get(String key) {
        if (!settings.containsKey(key))
            throw new RuntimeException("Setting not found: " + key);
        return settings.get(key);
    }

    public void saveToFile(String path) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (var entry : settings.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
        }
    }

    public void loadFromFile(String path) throws IOException {
        settings.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2)
                    settings.put(parts[0], parts[1]);
            }
        }
    }
}
