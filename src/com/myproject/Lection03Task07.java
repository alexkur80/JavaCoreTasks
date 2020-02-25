/**
 *  This class request int number and output factorial of this number
 *
 * @author  Kurlovich Alexander
 * @param intNumber  - int number.
 *
 * checkScannerIntNumber(sc, intNumber) - method from Utils class. Request number in console.
 *
 * @return  number factorial
 *
 */

import java.util.Scanner;

import static com.myproject.Utils.checkScannerIntNumber;


public class Lection03Task07 {

    public static void main(String[] args) {
        int intNumber = 1;

        Scanner sc = new Scanner(System.in);

        intNumber = checkScannerIntNumber(sc, intNumber);

        int tmpIntNumber = intNumber;
        int tmpJ = 1;
        for (int i = 1; i <= intNumber; i++) {
            tmpJ = tmpJ*i;
        }
        System.out.println("Factorial of " + tmpIntNumber + "! is :" + tmpJ);
    }
}
