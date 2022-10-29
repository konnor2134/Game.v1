package game;

public class BattleGround {
    public static void main(String[] args) {
        Demon firstEnemy = new Demon("Devil",100);
        Elemental secondEnemy = new Elemental("Rock",100);
        Zombie thirdEnemy = new Zombie("Alexander",100);

        Warrior first = new Warrior("Albert",100);
        System.out.println("*******************************************************");
        first.attackEnemy(firstEnemy);
        firstEnemy.isAlive();
        System.out.println("-------------------------------------------------------");
        firstEnemy.attackHero(first);
        first.isAlive();
        System.out.println("*******************************************************");
        Archer second = new Archer("Artem",100);
        second.attackEnemy(secondEnemy);
        secondEnemy.isAlive();
        System.out.println("-------------------------------------------------------");
        secondEnemy.attackHero(second);
        second.isAlive();
        System.out.println("*******************************************************");
        Mage third = new Mage("Degemon",100);
        third.attackEnemy(thirdEnemy);
        thirdEnemy.isAlive();
        System.out.println("-------------------------------------------------------");
        thirdEnemy.attackHero(third);
        third.isAlive();
        System.out.println("*******************************************************");




    }
}
