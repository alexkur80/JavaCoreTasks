package com.myproject.lection03;

import static com.myproject.utils.Utils.checkScannerIntNumber;

/**
 * Requests int number and check if this number is SIMPLE or not. Output result
 */
public class Task06 {

    public static void main(String[] args) {
        int intNumber = checkScannerIntNumber();
        boolean ifNumberIsSimple = checkNumberIsSimple(intNumber);

        if (ifNumberIsSimple) {
            System.out.println("Number " + intNumber + " is simple number");
        } else {
            System.out.println("Number " + intNumber + " is NOT simple number");
        }
    }

    /**
     * Checks if int number is simple or not.
     * <p>
     * Simple number is that number that NUMBER % X == 0. 1 and 2 - SIMPLE numbers. In this algorithm we
     * check numbers between 2  * and (NUMBER -1) because NUMBER % NUMBER == 0
     * (every natural number NUMBER % 1 ==0 AND NUMBER % NUMBER ==0)
     *
     * @return true/false
     */
    public static boolean checkNumberIsSimple(int intNumber) {
        /* starts with 2 because 1,2 simple numbers, don't should check them*/

        int startIndex = 2;
        for (int i = startIndex; i < intNumber; i++) {
            if (intNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}