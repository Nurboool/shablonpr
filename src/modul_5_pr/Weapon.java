package modul_5_pr;

public class Weapon implements Cloneable {
    String name;
    int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public Weapon clone() {
        return new Weapon(name, damage);
    }
}
