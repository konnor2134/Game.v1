package game;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    void attackEnemy(Enemy taken) {
        System.out.print(name + " стреляет");
        taken.takeDamage(15);
    }
}
