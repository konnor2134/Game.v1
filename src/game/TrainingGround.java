package game;

public class TrainingGround {

    public TrainingGround() {
    }

    public static void main(String[] args) {
        Hero first = new Hero("Dima");
        Enemy firstEnemy = new Enemy(100);
        Enemy secondEnemy = new Enemy(100);
        Enemy thirdEnemy = new Enemy(100);
        first.attackEnemy(firstEnemy);
        Warrior second = new Warrior("Albert");
        second.attackEnemy(secondEnemy);
        Archer third = new Archer("Artem");
        third.attackEnemy(thirdEnemy);
        Mage four = new Mage("Degemon");
        four.attackEnemy(thirdEnemy);

    }
}
