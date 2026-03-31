package facade_9DZ;

public class HomeTheaterFacade {

    private TV tv;
    private AudioSystem audio;
    private DVDPlayer dvd;
    private GameConsole game;

    public HomeTheaterFacade(TV tv, AudioSystem audio, DVDPlayer dvd, GameConsole game) {
        this.tv = tv;
        this.audio = audio;
        this.dvd = dvd;
        this.game = game;
    }

    // 🎬 Фильм көру
    public void watchMovie() {
        System.out.println("Starting movie...");

        tv.on();
        tv.setChannel(1);

        audio.on();
        audio.setVolume(20);

        dvd.play();
    }

    // 🎮 Ойын бастау
    public void playGame() {
        System.out.println("Starting game...");

        tv.on();
        game.on();
        game.startGame();
    }

    // 🎵 Музыка тыңдау
    public void listenMusic() {
        System.out.println("Music mode...");

        tv.on();
        audio.on();
        audio.setVolume(15);
    }

    // 🔇 Өшіру
    public void turnOff() {
        System.out.println("Turning everything OFF...");

        dvd.stop();
        audio.off();
        tv.off();
    }

    // 🔊 Дыбыс өзгерту
    public void setVolume(int level) {
        audio.setVolume(level);
    }
}