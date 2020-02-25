/**
 *
 * @param int checkScannerIntNumber (Scanner sc1, int intNumber)
 *            Request Int number from console and check if it is Int or not.
 * @return    intNumber  - requested number from console.
 */


package com.myproject;

import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {

    }

    public static int checkScannerIntNumber (Scanner sc1, int intNumber){
        System.out.print("Input int number but NOT ZERO: ");
        if (sc1.hasNextInt()) {
            intNumber = sc1.nextInt();

        }  else {
            System.out.println("You input wrong number, try again");

        }
        return intNumber;
    }


}
