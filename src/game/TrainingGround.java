package game;

public class TrainingGround {

    public static void main(String[] args) {

        Demon firstEnemy = new Demon("Devil",100);
        Elemental secondEnemy = new Elemental("Rock",100);
        Zombie thirdEnemy = new Zombie("Alexander",100);

        Warrior first = new Warrior("Albert",100);
        first.attackEnemy(firstEnemy);
        firstEnemy.isAlive();
        firstEnemy.attackHero(first);
        first.isAlive();
        Archer second = new Archer("Artem",100);
        second.attackEnemy(secondEnemy);
        secondEnemy.isAlive();
        secondEnemy.attackHero(second);
        second.isAlive();
        Mage third = new Mage("Degemon",100);
        third.attackEnemy(thirdEnemy);
        thirdEnemy.isAlive();
        thirdEnemy.attackHero(third);
        third.isAlive();


    }
}

