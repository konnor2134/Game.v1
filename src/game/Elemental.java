package game;

public class Elemental extends Enemy{
    public Elemental(String name, int health) {
        super(name,health);
    }

    @Override
    void attackHero(Hero attack) {
        System.out.print(name + " throws a stone,");
        attack.takeDamage(20);
    }
}
