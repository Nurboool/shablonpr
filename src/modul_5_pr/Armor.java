package modul_5_pr;

public class Armor implements Cloneable {
    String type;
    int defense;

    public Armor(String type, int defense) {
        this.type = type;
        this.defense = defense;
    }

    public Armor clone() {
        return new Armor(type, defense);
    }
}
