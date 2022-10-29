package game;

public abstract class Hero implements Mortal {
    String name;
    int health;


    public String getName() {
        return name;
    }

    public Hero(String name, int health) {

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
        System.out.println(" the hero has left " + getHealth() + " hp ");

        return health;

    }

    @Override
    public boolean isAlive() {
        if (getHealth() > 0) {
            System.out.println("Hero " + name + " is alive");
            return true;
        }
        System.out.println("Hero " + name + " is dead");
        return false;
    }
    abstract void attackEnemy(Enemy attack);

}

