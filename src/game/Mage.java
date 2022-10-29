package game;

public class Mage extends Hero {
    public Mage(String name,int health) {
        super(name,health);
    }

    @Override
    void attackEnemy(Enemy attack) {
        System.out.print(name + " casts spells,");
        attack.takeDamage(12);
    }
}
