package com.myproject.lection03; /**
 *  This class request int number and calculate factorial of this number. Use FOR operator for cycle.
 *
 * @author  Kurlovich Alexander
 * @param intNumber  - int number.
 * @see com.myproject.utils.Utils.checkScannerIntNumber
 * @see checkScannerIntNumber(sc, intNumber) - method from Utils class. Request number in console.
 *
 * @return  number factorial
 */

import java.util.Scanner;

import static com.myproject.utils.Utils.checkScannerIntNumber;


public class Lection03Task07 {

    public static void main(String[] args) {
        int intNumber = 1;

        Scanner sc = new Scanner(System.in);

        intNumber = checkScannerIntNumber(sc);

        int tmpJ = 1;
        for (int i = 1; i <= intNumber; i++) {
            tmpJ = tmpJ*i;
        }
        System.out.println("Factorial of " + intNumber + " is: " + tmpJ);
    }
}
