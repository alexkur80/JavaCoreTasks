/**
 * This class request int number and check if this number is SIMPLE or not. Output result
 *
 * @author Kurlovich Alexander
 * @return Output if number is Simple or not..
 * @see com.myproject.Utils.Utils.checkScannerIntNumbe - method that checkinput number
 * checkScannerIntNumber(sc1, intNumber) - verify if number you input is INT
 * checkNumberIsSimple(intNumber, ifNumberIsSimple); - return boolean flag TRUE or FALCE is number is SIMPLE or
 * NOT SIMPLE.
 * <p>
 * Simple number is that number that NUMBER % X == 0. 1 and 2 - SIMPLE numbers. In this alghoritm we
 * check numbers between 2  * and (NUMBER -1) because NUMBER % NUMBER == 0
 * (every natural number NUMBER % 1 ==0 AND NUMBER % NUMBER ==0)
 */

package com.myproject.Lection03;

import java.util.Scanner;

import static com.myproject.Utils.Utils.checkScannerIntNumber;

public class Lection03Task06 {

    public static void main(String[] args) {
        int intNumber = 0;
        boolean ifNumberIsSimple = false;

        Scanner sc1 = new Scanner(System.in);

        intNumber = checkScannerIntNumber(sc1);
        ifNumberIsSimple = checkNumberIsSimple(intNumber, ifNumberIsSimple);

        if (ifNumberIsSimple == true) {
            System.out.println("Number " + intNumber + " is simple number");
        } else {
            System.out.println("Number " + intNumber + " is NOT simple number");
        }

    }

    public static boolean checkNumberIsSimple(int intNumber, boolean ifNumberIsSimple) {
        for (int i = 2; i < intNumber; i++) {
            if (intNumber % i == 0) {
                ifNumberIsSimple = false;
                return ifNumberIsSimple;
            }

        }
        return (ifNumberIsSimple = true);
    }

}

