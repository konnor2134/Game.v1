package game;

public class Demon extends Enemy {
    public Demon(String name,int health) {
        super(name,health);
    }

    @Override
    void attackHero(Hero attack) {
        System.out.print(name + " unleashes dark power,");
        attack.takeDamage(25);
    }

}
