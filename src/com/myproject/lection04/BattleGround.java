/**
 * BattleGround perform game "Hero" that simulate fight between Hero and Enemy. User can choose
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
 */

package com.myproject.lection04;

import static com.myproject.utils.Utils.checkScannerIntNumberNew;

public class BattleGround {
    public static void main(String[] args) {
        String invitation01 = ("Choose hero whom you would like to play:\n" +
                "1. Warrior Vasiliy  - his strikes are middle\n" +
                "2. Archer Piotr     - his strikes are weak\n" +
                "3. Mage Marfa       - her strikes are strong\n>>> ");

        int idHeroProfile;
        idHeroProfile = checkScannerIntNumberNew(invitation01);

        String invitation02 = ("Choose enemy who you would like to fight with:\n" +
                "1. Zombie Vanno     - his strikes are weak but he reborn! The most dangerous guy\n" +
                "2. IronMan Mikola   - his strikes are strong and Warriors and Archers have " +
                "no affect to him. Just Mage can kill him\n>>> ");

        int idEnemyProfile;
        idEnemyProfile = checkScannerIntNumberNew(invitation02);

        Hero whoHeroIsReadyToFight = null;
        if (idHeroProfile == 1) {
            whoHeroIsReadyToFight = new Warrior("Warrior Vasiliy", 100);
        } else if (idHeroProfile == 2) {
            whoHeroIsReadyToFight = new Archer("Archer Piotr", 100);
        } else if (idHeroProfile == 3) {
            whoHeroIsReadyToFight = new Mage("Mage Marfa", 100);
        }

        Enemy whoEnemyReadyToFight = null;
        if (idEnemyProfile == 1) {
            Enemy zombieOne = new Zombie("Zombie Vanno", 100, true);
            whoEnemyReadyToFight = zombieOne;
        }
        if (idEnemyProfile == 2) {
            Enemy ironmanOne = new IronMan("IronMan Mikola", 100, true);
            whoEnemyReadyToFight = ironmanOne;
        }

        assert whoHeroIsReadyToFight != null;
        System.out.println("\n" + whoHeroIsReadyToFight.getName() + " vs "
                + whoEnemyReadyToFight.getName() + " - FIGHT!!!!\n");

        int counterStrikeEnemy = 0;
        while (whoEnemyReadyToFight.isAlive() && whoHeroIsReadyToFight.isAlive()) {
            counterStrikeEnemy++;
            whoEnemyReadyToFight.attackHero(whoHeroIsReadyToFight);
            if (!whoHeroIsReadyToFight.isAlive()) {
                System.out.println("It tooks " + counterStrikeEnemy
                        + " strikes to kill " + whoHeroIsReadyToFight.getName());
            }

            int counterStrikeHero = 0;
            counterStrikeHero++;
            whoHeroIsReadyToFight.attackEnemy(whoEnemyReadyToFight);
            if (!whoEnemyReadyToFight.isAlive()) {
                System.out.println("It tooks " + counterStrikeHero
                        + " strikes to kill " + whoEnemyReadyToFight.getName());
            }
        }
    }
}