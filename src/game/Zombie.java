package game;

public class Zombie extends Enemy {
    public Zombie(String name,int health) {
        super(name,health);
    }

    @Override
    void attackHero(Hero attack) {
        System.out.print(name + " bites,");
        attack.takeDamage(5);
    }
}
