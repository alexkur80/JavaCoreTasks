package com.myproject.lection04;

import java.util.Random;

class Zombie extends Enemy {
    private boolean reborn;

    Zombie(String name, int health, boolean reborn) {
        super(name, health);
        this.reborn = reborn;
    }

    public boolean getReborn() {
        return reborn;
    }

    public int getHealth() {
        return super.getHealth();
    }

    void attackHero(Hero heroObj) {
        Random rnd = new Random();
        int highRandomElement = 10;
        int lowRandomElement = 7;
        int damage = rnd.nextInt(highRandomElement - lowRandomElement) + lowRandomElement;

        if (heroObj.isAlive() && (damage > heroObj.getHealth())) {
            damage = heroObj.getHealth();
            heroObj.takeDamage(damage);
            System.out.println(super.getName() + " is attacking for the last "
                    + damage + "%  and " + heroObj.getName() + " has "
                    + heroObj.getHealth() + "% left");

        } else if (heroObj.isAlive()) {
            heroObj.takeDamage(damage);
            System.out.println(super.getName() + " is attacking for "
                    + damage + "% damage and " + heroObj.getName()
                    + " has " + heroObj.getHealth() + "% left");
        }
    }
}