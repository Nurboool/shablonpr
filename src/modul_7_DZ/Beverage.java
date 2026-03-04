package modul_7_DZ;

import java.util.Scanner;

public abstract class Beverage {

    public final void prepareRecipe() {

        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments())
            addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();
    abstract void addCondiments();

    boolean customerWantsCondiments() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Add condiments? (yes/no)");

        String answer = sc.nextLine();

        return answer.equalsIgnoreCase("yes");
    }
}