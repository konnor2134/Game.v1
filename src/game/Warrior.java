package game;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name,health);
    }

    @Override
    void attackEnemy(Enemy attack) {
        System.out.print(name + " attacks with a sword,");
        attack.takeDamage(20);

    }

}
