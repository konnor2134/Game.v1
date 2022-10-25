package game;

import game.Hero;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    void attackEnemy(Enemy taken) {
        System.out.print(name + " воюет");
        taken.takeDamage(20);

    }

}
