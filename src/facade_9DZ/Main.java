package facade_9DZ;

public class Main {

    public static void main(String[] args) {

        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer dvd = new DVDPlayer();
        GameConsole game = new GameConsole();

        HomeTheaterFacade facade =
                new HomeTheaterFacade(tv, audio, dvd, game);

        facade.watchMovie();
        System.out.println("-----");

        facade.playGame();
        System.out.println("-----");

        facade.listenMusic();
        System.out.println("-----");

        facade.turnOff();
    }
}