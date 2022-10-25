package game;

import game.Hero;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    void attackEnemy(Enemy taken) {
        System.out.print(name + " колдует");
        taken.takeDamage(12);
    }
}
