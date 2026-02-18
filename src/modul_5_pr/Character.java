package modul_5_pr;

import java.util.ArrayList;
import java.util.List;

public class Character implements Cloneable {

    int health, strength, agility, intelligence;
    Weapon weapon;
    Armor armor;
    List<Skill> skills = new ArrayList<>();

    public Character clone() {
        Character c = new Character();
        c.health = health;
        c.strength = strength;
        c.agility = agility;
        c.intelligence = intelligence;

        c.weapon = weapon.clone();
        c.armor = armor.clone();

        for (Skill s : skills)
            c.skills.add(s.clone());

        return c;
    }

    public void print() {
        System.out.println("HP:"+health+" STR:"+strength+" Weapon:"+weapon.name+" Armor:"+armor.type+" Skills:"+skills.size());
    }
}
