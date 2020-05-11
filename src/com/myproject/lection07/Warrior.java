package com.myproject.lection07;

import java.util.Random;

class Warrior extends Hero {

    Warrior(String name, int health) {
        super(name, health);
    }

    public boolean isAlive() {
        return super.getHealth() > 0;
    }

    public void takeDamage(int damage) {
        int health;
        health = super.getHealth();
        health -= damage;
        setHealth(health);
    }

    @Override
    public void attackEnemy(Enemy enemyObj) {
        int highRandomElement = 11;
        int lowRandomElement = 8;
        int highRandomElementIronman = 5;
        int lowRandomElementIronman = 2;

        Random rnd = new Random();

        int damage = rnd.nextInt(highRandomElement - lowRandomElement) + lowRandomElement;
        int damageIronman = rnd.nextInt(highRandomElementIronman - lowRandomElementIronman)
                + lowRandomElementIronman;

        if (enemyObj.getArmour()) {
            enemyObj.takeDamage(damageIronman);
            System.out.println("   " + super.getName() + " has very little affect for "
                    + damageIronman + "% and after strike " + enemyObj.getName() + " has "
                    + enemyObj.getHealth() + "% of health");
            return;
        }

        if (enemyObj.isAlive() && (damage >= enemyObj.getHealth()) && enemyObj.getReborn()) {
            damage = enemyObj.getHealth();
            enemyObj.takeDamage(damage);
            enemyObj.setHealth(100);
            System.out.println("   " + super.getName() + " is attacking for the last "
                    + damage + "%" + " but " + enemyObj.getName()
                    + "is reborning and have again with "
                    + enemyObj.getHealth() + "% health");

        } else if (enemyObj.isAlive() && (damage >= enemyObj.getHealth())) {
            damage = enemyObj.getHealth();
            enemyObj.takeDamage(damage);
            System.out.println("   " + super.getName() + " is attacking for the last "
                    + damage + "%" + " and " + enemyObj.getName() + " have "
                    + enemyObj.getHealth() + "% left");

        } else if (enemyObj.isAlive()) {
            enemyObj.takeDamage(damage);
            System.out.println("   " + super.getName() + " is attacking "
                    + " for " + damage + "% damage and " + enemyObj.getName() + " left "
                    + enemyObj.getHealth() + "%");
        }
    }
}