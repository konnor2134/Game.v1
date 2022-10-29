package game;

public abstract class Enemy implements Mortal {
    int health;
    String name;

    public Enemy(String name,int health) {
        this.name = name;
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
        System.out.println(" the enemy "+ name + " has left " + getHealth() + " hp ");

        return health;

    }
    @Override
    public boolean isAlive() {
        if (getHealth() > 0) {
            System.out.println("Enemy "+ name + " is alive!");
            return true;
        }
        System.out.println("Enemy "+ name + " is dead!");
        return false;
    }
    abstract void attackHero(Hero attack);
}

