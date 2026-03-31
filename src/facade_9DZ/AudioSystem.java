package facade_9DZ;

public class AudioSystem {

    public void on() {
        System.out.println("Audio ON");
    }

    public void off() {
        System.out.println("Audio OFF");
    }

    public void setVolume(int level) {
        System.out.println("Volume set to " + level);
    }
}