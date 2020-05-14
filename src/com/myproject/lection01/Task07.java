package com.myproject.lection01;

import static com.myproject.utils.Utils.checkScannerIntNumber;

/**
 * Requests int number and calculate factorial of this number.
 */
public class Task07 {

    public static void main(String[] args) {
        int intNumber = checkScannerIntNumber();

        int tmpJ = 1;
        for (int i = 1; i <= intNumber; i++) {
            tmpJ = tmpJ * i;
        }
        System.out.println("Factorial of " + intNumber + " is: " + tmpJ);
    }
}