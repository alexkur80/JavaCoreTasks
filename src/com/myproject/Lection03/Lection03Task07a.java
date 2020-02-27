/**
 *  This class request int number and calculate factorial of this number. Use WHILE operator for cycle.
 *
 * @author  Kurlovich Alexander
 * @param intNumber  - int number.
 * @see com.myproject.Utils.Utils.checkScannerIntNumber
 * @see checkScannerIntNumber(sc, intNumber) - method from Utils class. Request number in console.
 *
 * @return  number factorial
 *
 */


package com.myproject.Lection03;

import java.util.Scanner;

import static com.myproject.Utils.Utils.checkScannerIntNumber;

public class Lection03Task07a {

    public static void main(String[] args) {
        int intNumber = 1;

        Scanner sc = new Scanner(System.in);

        intNumber = checkScannerIntNumber(sc);

        int tmpJ = 1;
        int i = 1;
        while (i <= intNumber) {
            tmpJ = tmpJ * i;
            i++;
        }
        System.out.println("Factorial of " + intNumber + " is: " + tmpJ);
    }
}