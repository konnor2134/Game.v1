package game;

public class BattleGround {
    public static void main(String[] args) {
        Demon firstEnemy = new Demon("Devil",60);
        Elemental secondEnemy = new Elemental("Rock",70);
        Zombie thirdEnemy = new Zombie("Alexander",40);

        Warrior first = new Warrior("Albert",80);
        System.out.println("*******************************************************");
        first.attackEnemy(firstEnemy);
        firstEnemy.isAlive();
        System.out.println("-------------------------------------------------------");
        firstEnemy.attackHero(first);
        first.isAlive();
        System.out.println("*******************************************************");
        Archer second = new Archer("Artem",75);
        second.attackEnemy(secondEnemy);
        secondEnemy.isAlive();
        System.out.println("-------------------------------------------------------");
        secondEnemy.attackHero(second);
        second.isAlive();
        System.out.println("*******************************************************");
        Mage third = new Mage("Degemon",70);
        third.attackEnemy(thirdEnemy);
        thirdEnemy.isAlive();
        System.out.println("-------------------------------------------------------");
        thirdEnemy.attackHero(third);
        third.isAlive();
        System.out.println("*******************************************************");




    }
}
