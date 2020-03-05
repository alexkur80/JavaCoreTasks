package com.myproject.lection07;


import java.util.Random;

abstract class Hero {
    private String name;

    Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void attackEnemy(Enemy enemyObj);
}


class Warrior extends Hero {

    Warrior(String name) {
        super(name);
        System.out.println("Enemy is attacking, hero - you should be aware! ");
    }


    @Override
    void attackEnemy(Enemy enemyObj) {
        int damage = 10;

        if (damage > enemyObj.getHealth()) {
            damage = enemyObj.getHealth();
        }

        enemyObj.takeDamage(damage);
        if (enemyObj.getHealth() == 0) {
            System.out.println(super.getName() + " is attacking enemy for the last " + damage + "%" + " and enemy have "
                    + enemyObj.getHealth() + "% left");
            return;
        } else {
            System.out.println(super.getName() + " is attacking enemy for " + damage + "% damage and enemy left just "
                    + enemyObj.getHealth() + "%");

        }
    }
}

class Mage extends Hero {

    Mage(String name) {
        super(name);
    }


    @Override
    void attackEnemy(Enemy enemyObj) {
        int damage = 17;

        if (damage > enemyObj.getHealth()) {
            damage = enemyObj.getHealth();
        }

        enemyObj.takeDamage(damage);
        if (enemyObj.getHealth() == 0) {
            System.out.println(super.getName() + " is attacking enemy for the last " + damage + "%" + " and enemy have "
                    + enemyObj.getHealth() + "% left");
            return;
        } else {
            System.out.println(super.getName() + " is attacking enemy for " + damage + "% damage and enemy left just "
                    + enemyObj.getHealth() + "%");

        }
    }
}

class Archer extends Hero {

    Archer(String name) {
        super(name);
    }


    @Override
    void attackEnemy(Enemy enemyObj) {
        int damage = 12;

        if (damage > enemyObj.getHealth()) {
            damage = enemyObj.getHealth();
        }

        enemyObj.takeDamage(damage);
        if (enemyObj.getHealth() == 0) {
            System.out.println(super.getName() + " is attacking enemy for the last " + damage + "%" + " and enemy have "
                    + enemyObj.getHealth() + "% left");
            return;
        } else {
            System.out.println(super.getName() + " is attacking enemy for " + damage + "% damage and enemy left just "
                    + enemyObj.getHealth() + "%");

        }
    }

}


class Enemy {
    private int health;

    Enemy(int enemyHealth) {
        health = enemyHealth;
        System.out.println("Enemy has health " + health + "%");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    void takeDamage(int damage) {
        health = health - damage;
    }

}

public class TrainingGround {
    public static void main(String[] args) {
        int randomDamageWarrior = 0;
        int randomDamageArcher = 0;
        int randomDamageMage = 0;


        Enemy enemyOne = new Enemy(100);
        Warrior warriorOne = new Warrior("Warrior Vasiliy");
        Archer archerOne = new Archer("Archer Piotr");
        Mage mageOne = new Mage("Mage Natalia");

        int counterStrike = 0;
        while (enemyOne.getHealth() > 0) {

            counterStrike++;
            warriorOne.attackEnemy(enemyOne);
            if (enemyOne.getHealth() == 0) {
                System.out.println("It tooks " + counterStrike + " strikes to kill enemy");
                return;
            }

            counterStrike++;
            mageOne.attackEnemy(enemyOne);
            if (enemyOne.getHealth() == 0) {
                System.out.println("It tooks " + counterStrike + " strikes to kill enemy");
                return;
            }

            counterStrike++;
            archerOne.attackEnemy(enemyOne);
            if (enemyOne.getHealth() == 0) {
                System.out.println("It tooks " + counterStrike + " strikes to kill enemy");
                return;
            }
        }


    }
}

