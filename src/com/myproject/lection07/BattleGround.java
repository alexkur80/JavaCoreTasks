/**
 * Class BattleGround perform game "Hero" that simulate fight between Hero and Enemy. User can choose
 * who he is playing and fighting with. Enemy has different super oppurtunities, heroes also have
 * different characteristics:
 * <p>
 * Heroes:
 * 1. Warrior Vasiliy  - his strikes are middle". He affects very little for Enemy Ironman
 * 2. Archer Piotr     - his strikes are weak"
 * 3. Mage Marfa       - her strikes are strong");
 * <p>
 * Enemys:
 * <p>
 * 1. Zombie Vanno     - his strikes are weak but he reborns! The most dangerous guy\n" +
 * 2. IronMan Mikola   - his strikes are strong and Warriors very little affect to him. Archer Piotr has
 * no affect at all.
 *
 * @author Kurlovich Alexander
 * @return Simulate fight Hero vs Enemy
 */


package com.myproject.lection07;

import java.util.Random;

import java.util.Scanner;

import static com.myproject.utils.Utils.checkScannerIntNumberNew;

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


class Warrior extends Hero {

    Warrior(String name, int health) {
        super(name, health);
    }

    public boolean isAlive() {

        if (super.getHealth() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void takeDamage(int damage) {
        int health = super.getHealth();
        health -= damage;
        setHealth(health);
    }


    @Override
    void attackEnemy(Enemy enemyObj) {
        Random rnd = new Random();
        int highRandomElement = 11;
        int lowRandomElement = 8;

        int highRandomElementIronman = 5;
        int lowRandomElementIronman = 2;

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


class Mage extends Hero {

    Mage(String name, int health) {
        super(name, health);
    }

    public boolean isAlive() {
        if (super.getHealth() > 0) {
            return true;
        } else {
            return false;
        }
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


class Archer extends Hero {
    Archer(String name, int health) {
        super(name, health);
    }

    public boolean isAlive() {

        if (super.getHealth() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void takeDamage(int damage) {
        int health = super.getHealth();
        health -= damage;
        super.setHealth(health);
    }

    @Override
    void attackEnemy(Enemy enemyObj) {
        Random rnd = new Random();
        int highRandomElement = 10;
        int lowRandomElement = 7;
        int damage = rnd.nextInt(highRandomElement - lowRandomElement) + lowRandomElement;

        if (enemyObj.getArmour()) {
            damage = 0;
            enemyObj.takeDamage(damage);
            System.out.println("   " + super.getName() + " doesn't affect at all and "
                    + enemyObj.getName() + " still has "
                    + enemyObj.getHealth() + "% of health");
            return;
        }

        if (enemyObj.isAlive() && (damage >= enemyObj.getHealth()) && enemyObj.getReborn()) {
            damage = enemyObj.getHealth();
            enemyObj.takeDamage(damage);
            enemyObj.setHealth(100);
            System.out.println("   " + super.getName() + " is attacking for the last "
                    + damage + "% but " + enemyObj.getName() + "is reborning and have again "
                    + enemyObj.getHealth() + "% health");

        } else if (enemyObj.isAlive() && (damage >= enemyObj.getHealth())) {
            damage = enemyObj.getHealth();
            enemyObj.takeDamage(damage);
            System.out.println("   " + super.getName() + " is attacking for the last "
                    + damage + "%" + " and " + enemyObj.getName() + " has "
                    + enemyObj.getHealth() + "% left");

        } else if (enemyObj.isAlive()) {
            enemyObj.takeDamage(damage);
            System.out.println("   " + super.getName() + " is attacking "
                    + " for " + damage + "% damage and " + enemyObj.getName() + " left "
                    + enemyObj.getHealth() + "%");
        }
    }
}


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

        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    abstract void attackHero(Hero heroObj);
}


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

interface Mortal {
    boolean isAlive();
}

public class BattleGround {
    public static void main(String[] args) {

        int counterStrikeHero = 0;
        int counterStrikeEnemy = 0;
        int idHeroProfile;
        int idEnemyProfile;

        Hero whoHeroIsReadyToFight = null;
        Enemy whoEnemyReadyToFight = null;

        String invitation01 = ("Choose hero whom you would like to play:\n" +
                "1. Warrior Vasiliy  - his strikes are middle\n" +
                "2. Archer Piotr     - his strikes are weak\n" +
                "3. Mage Marfa       - her strikes are strong\n>>> ");

        Scanner sc = new Scanner(System.in);
        idHeroProfile = checkScannerIntNumberNew(sc, invitation01);

        String invitation02 = ("Choose enemy who you would like to fight with:\n" +
                "1. Zombie Vanno     - his strikes are weak but he reborn! The most dangerous guy\n" +
                "2. IronMan Mikola   - his strikes are strong and Warriors and Archers have " +
                "no affect to him. Just Mage can kill him\n>>> ");

        idEnemyProfile = checkScannerIntNumberNew(sc, invitation02);

        if (idHeroProfile == 1) {
            Warrior warriorOne = new Warrior("Warrior Vasiliy", 100);
            whoHeroIsReadyToFight = warriorOne;
        } else if (idHeroProfile == 2) {
            Archer archerOne = new Archer("Archer Piotr", 100);
            whoHeroIsReadyToFight = archerOne;
        } else if (idHeroProfile == 3) {
            Mage mageOne = new Mage("Mage Marfa", 100);
            whoHeroIsReadyToFight = mageOne;
        }

        if (idEnemyProfile == 1) {
            Enemy zombieOne = new Zombie("Zombie Vanno", 100, true);
            whoEnemyReadyToFight = zombieOne;
        }
        if (idEnemyProfile == 2) {
            Enemy ironmanOne = new IronMan("IronMan Mikola", 100, true);
            whoEnemyReadyToFight = ironmanOne;
        }

        System.out.println("\n" + whoHeroIsReadyToFight.getName() + " vs "
                + whoEnemyReadyToFight.getName() + " - FIGHT!!!!\n");

        while (whoEnemyReadyToFight.isAlive() && whoHeroIsReadyToFight.isAlive()) {

            counterStrikeEnemy++;
            whoEnemyReadyToFight.attackHero(whoHeroIsReadyToFight);
            if (!whoHeroIsReadyToFight.isAlive()) {
                System.out.println("It tooks " + counterStrikeEnemy
                        + " strikes to kill " + whoHeroIsReadyToFight.getName());
                return;
            }

            counterStrikeHero++;
            whoHeroIsReadyToFight.attackEnemy(whoEnemyReadyToFight);
            if (!whoEnemyReadyToFight.isAlive()) {
                System.out.println("It tooks " + counterStrikeHero
                        + " strikes to kill " + whoEnemyReadyToFight.getName());
            }
        }
    }
}

