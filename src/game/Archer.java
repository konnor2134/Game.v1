package game;

public class Archer extends Hero {
    public Archer(String name,int health) {
        super(name,health);
    }

    @Override
    void attackEnemy(Enemy attack) {
        System.out.print(name + " shoots a bow,");
        attack.takeDamage(15);
    }
}
