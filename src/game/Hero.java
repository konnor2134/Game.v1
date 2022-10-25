package game;


public class Hero {
    String name;


    public String getName() {
        return name;
    }

    public Hero(String name) {
        this.name = name;
    }

    void attackEnemy(Enemy taken ) {
        System.out.print(name + " напад");
        taken.takeDamage(20);


    }
}

