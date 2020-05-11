package com.myproject.lection07;

abstract class Enemy implements Mortal {
    private String name;
    private int health;
    private boolean reborn;
    private boolean armour;

    Enemy(String name, int health) {
        this.name = name;
        this.health = health;
        System.out.println("Enemy has health " + health + "% and he is very danger!");
    }

    public boolean getArmour() {
        return armour;
    }

    public boolean getReborn() {
        return reborn;
    }

    public void setReborn(boolean reborn) {
        this.reborn = reborn;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    abstract void attackHero(Hero heroObj);
}