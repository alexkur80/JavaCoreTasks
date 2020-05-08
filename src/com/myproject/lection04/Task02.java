/**
 * This class modulate ATM system. Banknotes have three parameters:
 * banknotes20Usd, banknotes50Usd, banknotes100Usd defined in Constructor.
 *
 * @author  Kurlovich Alexander
 * @version Lection04Task02
 * @param int Atm pushToAtm() - method accept funds in ATM.
 * @param boolean withdrawOutOfAtm(Atm atmMachine)  - method return boolean of success procedure.
 *
 */

package com.myproject.lection04;

import java.util.Scanner;

import static com.myproject.utils.Utils.checkScannerIntNumberNew;

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

        int banknotes100UsdToWithdrawTmp = 0;
        int banknotes50UsdToWithdrawTmp = 0;
        int banknotes20UsdToWithdrawTmp = 0;

        int banknotes100UsdToWithdrawFinish = 0;
        int banknotes50UsdToWithdrawFinish = 0;
        int banknotes20UsdToWithdrawFinish = 0;
        int cashToWithdrawNow;
        int allCashInAtm;

        Scanner sc = new Scanner(System.in);
        System.out.println("\nWe have banknotes only 100$, 50$, 20$  in ATM");

        cashToWithdrawNow = checkScannerIntNumberNew(sc, "How much USD you want to withdraw: ");

// >>>>>  START quick verification.

        if (cashToWithdrawNow % 10 != 0) {
            return false;
        }

        allCashInAtm = atmMachine.banknotes20Usd * 20 + atmMachine.banknotes50Usd * 50
                + atmMachine.banknotes100Usd * 100;

        if (cashToWithdrawNow > allCashInAtm) {
            System.out.println("You want to withdraw " + cashToWithdrawNow + " USD but we have just "
                    + allCashInAtm + " USD in ATM, find another ATM");
            return false;
        }

// <<<<<  STOP  quick verification.

// >>>>> START full verification

/*  This part of code START full verification, if possible to withdraw amount client needs in following
        cases:
        1)  ATM doesn't have enough banknotes necessary value. Example: ATM has 100$ x10, 50$ x5, 2$ x2 There
        is not possible to withdraw 60$, 160$, 280$ etc
        2) ATM has 100$ x10, 50$ x2, 20$ x20 in case client needs 260$ algorithm calculate this way:
        100$ x2  + 50$ x1 -> Verify if re rest amount %20 ==0 -? if not, DECREMENT 50$-- and withdraw
        the rest with 20$ banknotes.
 */

        banknotes100UsdToWithdrawTmp = cashToWithdrawNow / 100;

        if (banknotes100UsdToWithdrawTmp > 0 && banknotes100UsdToWithdrawTmp
                <= atmMachine.banknotes100Usd) {
            banknotes100UsdToWithdrawFinish = banknotes100UsdToWithdrawTmp;
            banknotes50UsdToWithdrawFinish = (cashToWithdrawNow % 100) / 50;

        } else if (banknotes100UsdToWithdrawTmp > 0 && banknotes100UsdToWithdrawTmp
                > atmMachine.banknotes100Usd) {
            banknotes100UsdToWithdrawFinish = atmMachine.banknotes100Usd;
            banknotes50UsdToWithdrawFinish = (cashToWithdrawNow - banknotes100UsdToWithdrawFinish
                    * 100) / 50;

        } else {
            banknotes50UsdToWithdrawFinish = cashToWithdrawNow / 50;
        }

        if (banknotes50UsdToWithdrawFinish > atmMachine.banknotes50Usd) {
            banknotes50UsdToWithdrawFinish = atmMachine.banknotes50Usd;
        }

/*  Here VERY IMPORTANT part of algorithm. Example: if client's withdraw amount is 60$
    we meet requirement: banknotes50UsdToWithdrawFinish == 1
    But  (cashToWithdrawNow / 50) % 20 !=0 and we have PROBLEM. The rest 10$ amount not
    possible to withdraw. 60$  = 20$ x3, 60$ != 50$ + 10$ since we don't have 10$ banknote.

    Solution is  - we should step back and DECREMENT  banknotes50UsdToWithdrawFinish
    to calculate the rest amount by 20$ banknotes.
*/

        if ((cashToWithdrawNow - banknotes100UsdToWithdrawFinish * 100 -
                banknotes50UsdToWithdrawFinish * 50) % 20 != 0 && banknotes50UsdToWithdrawFinish > 0) {
            banknotes50UsdToWithdrawFinish--;
        }

        banknotes20UsdToWithdrawTmp = (cashToWithdrawNow - banknotes100UsdToWithdrawFinish * 100
                - banknotes50UsdToWithdrawFinish * 50) / 20;

        if (banknotes20UsdToWithdrawTmp > 0 && banknotes20UsdToWithdrawTmp
                <= atmMachine.banknotes20Usd) {
            banknotes20UsdToWithdrawFinish = banknotes20UsdToWithdrawTmp;
        }

        if ((cashToWithdrawNow == (banknotes100UsdToWithdrawFinish * 100
                + banknotes50UsdToWithdrawFinish * 50 + banknotes20UsdToWithdrawFinish * 20))) {

            flag = true;
        }

// <<<<< STOP full verification

        if (flag) {

            System.out.println("We can offer following banknotes for your request:");
            System.out.println("100$ x" + banknotes100UsdToWithdrawFinish);
            System.out.println("50$  x" + banknotes50UsdToWithdrawFinish);
            System.out.println("20$  x" + banknotes20UsdToWithdrawFinish);
        }
        return flag;
    }
}

public class Task02 {
    public static void main(String[] args) {

// We need class atmMachine for future method so it doesn't should be lost!

        Atm atmMachine = Atm.pushToAtm();

// Return Flag of pullOutOfAtm  operation.

        boolean flag = Atm.withdrawOutOfAtm(atmMachine);
        System.out.println("Withdrawal result = " + flag);
    }
}


