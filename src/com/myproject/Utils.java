/**
 * @author  Kurlovich Alexander
 * @param int checkScannerIntNumber (Scanner sc1, int intNumber)
 *            Request Int number from console and check if it is Int or not.
 *
 * @param int checkScannerIntNumberNew(Scanner sc1, String invitation)
 *             request String invitation. Verify if input  amount <0  and request again.
 * @return    intNumber  - requested number from console.
 */


package com.myproject;

import java.util.Scanner;

public class Utils {


    public static int checkScannerIntNumber(Scanner sc1) {
        int intNumber = 0;
        System.out.print("Input int number but NOT ZERO: ");
        if (sc1.hasNextInt()) {
            intNumber = sc1.nextInt();

        } else {
            System.out.println("You input wrong number, try again");

        }
        return intNumber;
    }


// Verify if input number NOT ZERO

    public static int checkScannerIntNumberNew(Scanner sc1, String invitation) {
        int intNumber = 0;

        do {
            System.out.print(invitation);
            intNumber = sc1.nextInt();
        }
        while (intNumber <= 0);
        return intNumber;
    }


}

