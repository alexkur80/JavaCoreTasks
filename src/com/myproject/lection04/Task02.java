package com.myproject.lection04;

import static com.myproject.utils.Utils.checkScannerIntNumberNew;

/**
 * Modulates ATM system. Banknotes have three nominal:
 * banknotes20Usd, banknotes50Usd, banknotes100Usd defined in Constructor.
 * <p>
 * int Atm pushToAtm() - method accept funds in ATM.
 */
class Atm {
    private int banknotes20Usd;
    private int banknotes50Usd;
    private int banknotes100Usd;

    Atm(int banknotes20Usd, int banknotes50Usd, int banknotes100Usd) {
        this.banknotes20Usd = banknotes20Usd;
        this.banknotes50Usd = banknotes50Usd;
        this.banknotes100Usd = banknotes100Usd;
    }

    protected static Atm pushToAtm() {
        int banknotes20Usd = checkScannerIntNumberNew("Input amount of 20$ banknotes:\t");
        int banknotes50Usd = checkScannerIntNumberNew("Input amount of 50$ banknotes:\t");
        int banknotes100Usd = checkScannerIntNumberNew("Input amount of 100$ banknotes:\t");
        return new Atm(banknotes20Usd, banknotes50Usd, banknotes100Usd);
    }

    /**
     * Verifies success/fail procedure result
     *
     * @param atmMachine ARM loading object filled with banknotes
     * @return true/false (success/ fail)
     */
    static boolean withdrawOutOfAtm(Atm atmMachine) {
        System.out.println("\nWe have banknotes only 100$, 50$, 20$  in ATM");

        int cashToWithdrawNow = 0;
        cashToWithdrawNow = checkScannerIntNumberNew("How much USD you want to withdraw: ");

        if (cashToWithdrawNow % 10 != 0) {
            return false;
        }

        int allCashInAtm = 0;
        allCashInAtm = atmMachine.banknotes20Usd * 20 + atmMachine.banknotes50Usd * 50
                + atmMachine.banknotes100Usd * 100;

        if (cashToWithdrawNow > allCashInAtm) {
            System.out.println("You want to withdraw " + cashToWithdrawNow + " USD but we have just "
                    + allCashInAtm + " USD in ATM, find another ATM");
            return false;
        }

/*
This part of code START full verification, if possible to withdraw amount client needs in following
 cases:
 1)  ATM doesn't have enough banknotes necessary value. Example: ATM has 100$ x10, 50$ x5, 2$ x2 There
 is not possible to withdraw 60$, 160$, 280$ etc
 2) ATM has 100$ x10, 50$ x2, 20$ x20 in case client needs 260$ algorithm calculate this way:
 100$ x2  + 50$ x1 -> Verify if re rest amount %20 ==0 -? if not, DECREMENT 50$-- and withdraw
 the rest with 20$ banknotes.
*/
        int banknotes100UsdToWithdrawTmp;
        banknotes100UsdToWithdrawTmp = cashToWithdrawNow / 100;

        int banknotes50UsdToWithdrawFinish = 0;
        int banknotes100UsdToWithdrawFinish = 0;
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

/* Here VERY IMPORTANT part of algorithm. Example: if client's withdraw amount is 60$
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

        int banknotes20UsdToWithdrawTmp;
        banknotes20UsdToWithdrawTmp = (cashToWithdrawNow - banknotes100UsdToWithdrawFinish * 100
                - banknotes50UsdToWithdrawFinish * 50) / 20;

        int banknotes20UsdToWithdrawFinish = 0;
        if (banknotes20UsdToWithdrawTmp > 0 && banknotes20UsdToWithdrawTmp
                <= atmMachine.banknotes20Usd) {
            banknotes20UsdToWithdrawFinish = banknotes20UsdToWithdrawTmp;
        }

        boolean flag = false;
        if ((cashToWithdrawNow == (banknotes100UsdToWithdrawFinish * 100
                + banknotes50UsdToWithdrawFinish * 50 + banknotes20UsdToWithdrawFinish * 20))) {
            flag = true;
        }

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
        Atm atmMachine = Atm.pushToAtm();
        System.out.println("Withdrawal result = " + Atm.withdrawOutOfAtm(atmMachine));
    }
}