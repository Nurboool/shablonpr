package modul_5_pr;

public class PrototypeTest {

    public static void main(String[] args) {

        Character warrior = new Character();
        warrior.health = 100;
        warrior.strength = 50;
        warrior.weapon = new Weapon("Sword", 20);
        warrior.armor = new Armor("Heavy", 30);
        warrior.skills.add(new Skill("Slash"));

        Character clone = warrior.clone();
        clone.skills.add(new Skill("Fireball"));

        warrior.print();
        clone.print();
    }
}
