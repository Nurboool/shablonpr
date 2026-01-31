package modul_2_DZ;


public class DatabaseService {

    public void connect() {
        System.out.println("Connected using: " + AppConfig.CONNECTION_STRING);
    }
}
