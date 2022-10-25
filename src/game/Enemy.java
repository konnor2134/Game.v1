package game;

public class Enemy {
    int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int takeDamage(int damage) {
        health -= damage;
        System.out.println(" у врага осталось " + getHealth() + " хп ");

        return health;

    }
}

