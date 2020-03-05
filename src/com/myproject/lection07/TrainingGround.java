package com.myproject.lection07;


import java.util.Random;

class Hero {
    private String name;

    Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void attackEnemy(Enemy enemyObj, int damage) {
        enemyObj.takeDamage(damage);
        if (enemyObj.getHealth() == 0) {
            System.out.println(name + " is attacking enemy for the last " + damage + "%" + " and enemy have "
                    + enemyObj.getHealth() + "% left and died...");

        } else {
            System.out.println(name + " is attacking enemy for " + damage + "% damage and enemy left just "
                    + enemyObj.getHealth() + "%");
        }


    }
}


class Warrior extends Hero {

    Warrior(String name) {
        super(name);
        System.out.println("Enemy is attacking, hero - you should be aware! ");
    }


    @Override
    void attackEnemy(Enemy enemyObj, int damage) {
        enemyObj.takeDamage(damage);
        if (enemyObj.getHealth() == 0) {
            System.out.println(super.getName() + " is attacking enemy for the last " + damage + "%" + " and enemy have "
                    + enemyObj.getHealth() + "% left and died...");

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
    void attackEnemy(Enemy enemyObj, int damage) {
        enemyObj.takeDamage(damage);
        if (enemyObj.getHealth() == 0) {
            System.out.println(super.getName() + " is attacking enemy for the last " + damage + "%" + " and enemy have "
                    + enemyObj.getHealth() + "% left");
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
    void attackEnemy(Enemy enemyObj, int damage) {
        enemyObj.takeDamage(damage);
        if (enemyObj.getHealth() == 0) {
            System.out.println(super.getName() + " is attacking enemy for the last " + damage + "%" + " and enemy have "
                    + enemyObj.getHealth() + "% left");
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

        Random randomInt = new Random();

        randomDamageWarrior = randomInt.nextInt(10);
        randomDamageArcher = randomInt.nextInt(25);
        randomDamageMage = randomInt.nextInt(40);

        Enemy enemyOne = new Enemy(100);
        Hero heroOne = new Hero("Hero Amur");
        Warrior warriorOne = new Warrior("Warrior Vasiliy");
        Archer archerOne = new Archer("Archer Piotr");
        Mage mageOne = new Mage("Mage Natalia");

        int counterStrike = 0;
        while (enemyOne.getHealth() > 0) {
            int warriorAttack = randomInt.nextInt(20);
            int mageAttack = randomInt.nextInt(30);
            int archerAttack = randomInt.nextInt(25);

            counterStrike++;
            if (warriorAttack > enemyOne.getHealth()) {
                warriorAttack = enemyOne.getHealth();
                warriorOne.attackEnemy(enemyOne, warriorAttack);
                System.out.println("There are " + counterStrike + " stikes killed enemy");
                return;
            }
            warriorOne.attackEnemy(enemyOne, warriorAttack);

            counterStrike++;

            if (mageAttack > enemyOne.getHealth()) {
                mageAttack = enemyOne.getHealth();
                mageOne.attackEnemy(enemyOne, mageAttack);
                System.out.println("There are " + counterStrike + " stikes killed enemy");
                return;
            }
            mageOne.attackEnemy(enemyOne, mageAttack);

            counterStrike++;

            if (archerAttack > enemyOne.getHealth()) {
                archerAttack = enemyOne.getHealth();
                archerOne.attackEnemy(enemyOne, archerAttack);
                System.out.println("There are " + counterStrike + " stikes killed enemy");
                return;
            }
            archerOne.attackEnemy(enemyOne, archerAttack);

        }
    }
}
