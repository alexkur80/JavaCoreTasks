package com.myproject.lection04;

import java.util.Random;

class Mage extends Hero {

    Mage(String name, int health) {
        super(name, health);
    }

    public boolean isAlive() {
        return super.getHealth() > 0;
    }

    public void takeDamage(int damage) {
        int health = super.getHealth();
        health -= damage;
        setHealth(health);
    }

    @Override
    void attackEnemy(Enemy enemyObj) {
        Random rnd = new Random();
        int highRandomElement = 25;
        int lowRandomElement = 20;
        int damage = rnd.nextInt(highRandomElement - lowRandomElement) + lowRandomElement;

        if (enemyObj.isAlive() && (damage >= enemyObj.getHealth()) && enemyObj.getReborn()) {
            damage = enemyObj.getHealth();
            enemyObj.takeDamage(damage);
            enemyObj.setHealth(100);
            System.out.println("   " + super.getName() + " is attacking for the last "
                    + damage + "% but " + enemyObj.getName()
                    + " is reborning and have again "
                    + enemyObj.getHealth() + "% health");

        } else if (enemyObj.isAlive() && (damage >= enemyObj.getHealth())) {
            damage = enemyObj.getHealth();
            enemyObj.takeDamage(damage);
            System.out.println("   " + super.getName() + " is attacking for the last "
                    + damage + "%" + " and " + enemyObj.getName()
                    + " has " + enemyObj.getHealth() + "% left");

        } else if (enemyObj.isAlive()) {
            enemyObj.takeDamage(damage);
            System.out.println("   " + super.getName() + " is attacking "
                    + " for " + damage + "% damage and " + enemyObj.getName() + " has "
                    + enemyObj.getHealth() + "% left");
        }
    }
}