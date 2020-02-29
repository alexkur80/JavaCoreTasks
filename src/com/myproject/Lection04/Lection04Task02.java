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
        int usd20 = checkScannerIntNumberNew(sc, "Input amount of 20$ banknotes: ");
        int usd50 = checkScannerIntNumberNew(sc, "Input amount of 50$ banknotes: ");
        int usd100 = checkScannerIntNumberNew(sc, "Input amount of 100$ banknotes: ");
        Atm atmMachine = new Atm(usd20, usd50, usd100);
        return atmMachine;
    }


    static boolean pullOutOfAtm(Atm atmMachine) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        int cashToOutNow = checkScannerIntNumberNew(sc, "How much USD you want to pull out: ");
        int allCashInAtmToday = atmMachine.banknotes20Usd * 20 + atmMachine.banknotes50Usd * 50 +
                atmMachine.banknotes100Usd * 100;
        if (cashToOutNow > allCashInAtmToday) {
            System.out.println("We have just " + allCashInAtmToday + " USD in ATM and not able to give you amount" +
                    "you need.");
            flag = false;
        } else flag = true;

        return flag;

    }

}


public class Lection04Task02 {
    public static void main(String[] args) {

        // Put in atmMachine link to object that we just filled with $$$$$
        Atm atmMachine = Atm.pushToAtm();

        // Return Flag of success ot false pullOutOfAtm operation.

        boolean flagSuccess = Atm.pullOutOfAtm (atmMachine);

        System.out.println(flagSuccess);

    }

}


