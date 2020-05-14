package com.myproject.lection04;

abstract class Hero implements Mortal {
    private String name;
    private int health;

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    abstract void attackEnemy(Enemy enemyObj);

    abstract void takeDamage(int damage);
}