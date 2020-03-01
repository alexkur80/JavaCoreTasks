/**
 * This class modulate ATM system. Banknotes have three parameters:
 * banknotes20Usd, banknotes50Usd, banknotes100Usd defined in Constructor.
 *
 * @author  Kurlovich Alexander
 * @version Lection04Task02
 * @param int Atm pushToAtm() - method that accept funds in ATM.
 * @param boolean withdrawOutOfAtm(Atm atmMachine) - return boolean of success procedure.
 *
 */

package com.myproject.Lection04;

import java.util.Scanner;

import static com.myproject.Utils.Utils.checkScannerIntNumberNew;

class Atm {
    int banknotes20Usd;
    int banknotes50Usd;
    int banknotes100Usd;

    Atm(int usd20, int usd50, int usd100) {
        banknotes20Usd = usd20;
        banknotes50Usd = usd50;
        banknotes100Usd = usd100;
    }


    static Atm pushToAtm() {
        Scanner sc = new Scanner(System.in);
        int usd20 = checkScannerIntNumberNew(sc, "Input amount of 20$ banknotes:\t");
        int usd50 = checkScannerIntNumberNew(sc, "Input amount of 50$ banknotes:\t");
        int usd100 = checkScannerIntNumberNew(sc, "Input amount of 100$ banknotes:\t");
        Atm atmMachine = new Atm(usd20, usd50, usd100);
        return atmMachine;
    }


    static boolean withdrawOutOfAtm(Atm atmMachine) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWe have banknotes only 100$, 50$, 20$  in ATM");

// Check if ATM can send funds - if cashToOutNow % ANY BANKNOTE == 0
        int cashToWithdrawNow = checkScannerIntNumberNew(sc, "How much USD you want to withdraw: ");
        if (cashToWithdrawNow % 100 == 0 || cashToWithdrawNow % 50 == 0 || cashToWithdrawNow % 20 == 0) {
            flag = true;
        } else {
            return false;
        }

        int allCashInAtm = atmMachine.banknotes20Usd * 20 + atmMachine.banknotes50Usd * 50 +
                atmMachine.banknotes100Usd * 100;
        if (cashToWithdrawNow > allCashInAtm) {
            System.out.println("You want to withdraw " + cashToWithdrawNow + " USD but we have just " + allCashInAtm +
                    " USD in ATM, find another ATM");
            flag = false;
            return flag;
        }
        return flag;
    }
}


public class Lection04Task02 {
    public static void main(String[] args) {

// We need class atmMachine for future method so it doesn't should be lost!
        Atm atmMachine = Atm.pushToAtm();

// Return Flag of pullOutOfAtm operation.
        boolean flag = Atm.withdrawOutOfAtm(atmMachine);
        System.out.println("Withdrawal result = " + flag);
    }
}


