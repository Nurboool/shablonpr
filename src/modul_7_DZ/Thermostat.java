package modul_7_DZ;

public class Thermostat {

    private int temperature = 20;

    public void increase() {
        temperature++;
        System.out.println("Temperature increased: " + temperature);
    }

    public void decrease() {
        temperature--;
        System.out.println("Temperature decreased: " + temperature);
    }
}