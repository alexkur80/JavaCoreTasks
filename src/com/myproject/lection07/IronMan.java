package com.myproject.lection07;

import java.util.Random;

class IronMan extends Enemy {
    private boolean armour;

    public IronMan(String name, int health, boolean armour) {
        super(name, health);
        this.armour = armour;
    }

    public boolean getArmour() {
        return armour;
    }

    public int getHealth() {
        return super.getHealth();
    }

    void attackHero(Hero heroObj) {
        Random rnd = new Random();
        int highRandomElement = 20;
        int lowRandomElement = 10;
        int damage = rnd.nextInt(highRandomElement - lowRandomElement) + lowRandomElement;

        if (heroObj.isAlive() && (damage > heroObj.getHealth())) {
            damage = heroObj.getHealth();
            heroObj.takeDamage(damage);
            System.out.println(getName() + " is attacking " + heroObj.getName()
                    + " for the last " + damage + "%" + " and he has "
                    + heroObj.getHealth() + "% left");

        } else if (heroObj.isAlive()) {
            heroObj.takeDamage(damage);
            System.out.println(getName() + " is attacking " + heroObj.getName()
                    + " for " + damage + "% damage and he left just "
                    + heroObj.getHealth() + "%");
        }
    }
}