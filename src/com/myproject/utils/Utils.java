package com.myproject.utils;

import java.util.Scanner;

public class Utils {

    /**
     * Accepts int number
     *
     * @return int number
     */
    public static int checkScannerIntNumber() {
        int intNumber = 0;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Input int number but NOT ZERO: ");
        if (sc1.hasNextInt()) {
            intNumber = sc1.nextInt();


        } else {
            System.out.println("You input wrong number, try again");

        }
        return intNumber;
    }

    /**
     * Accepts input number > 0
     *
     * @param invitation String
     * @return int entered number above ZERO
     */
    public static int checkScannerIntNumberNew(String invitation) {
        Scanner sc = new Scanner(System.in);

        int intNumber = 0;
        do {
            System.out.print(invitation);
            intNumber = sc.nextInt();
        }
        while (intNumber < 0);
        return intNumber;
    }
}