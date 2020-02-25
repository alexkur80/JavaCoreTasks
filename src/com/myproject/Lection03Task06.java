/**
 *  This class request int number and check if this number is SIMPLE or not. Output result
 *
 * @author  Kurlovich Alexander
 * @param int intNumber - store natural number we should check it is is SIMPLE or not.
 * @return  Output if number is Simple or not..
 *  checkScannerIntNumber(sc1, intNumber) - verify if number you input is INT
 *  checkNumberIsSimple(intNumber, ifNumberIsSimple); - return boolean flag TRUE or FALCE is number is SIMPLE or
 *  NOT SIMPLE.
 *
 * Simple number is that number that NUMBER % X == 0. 1 and 2 - SIMPLE numbers. In this alghoritm we
 * check numbers between 2  * and (NUMBER -1) because NUMBER % NUMBER == 0
 * (every natural number NUMBER % 1 ==0 AND NUMBER % NUMBER ==0)
 */

package com.myproject;

import java.util.Scanner;

public class Lection03Task06 {

    public static void main(String[] args) {
        int intNumber = 0;
        boolean ifNumberIsSimple = false;

        Scanner sc1 = new Scanner(System.in);

        intNumber = checkScannerIntNumber(sc1, intNumber);
        ifNumberIsSimple = checkNumberIsSimple(intNumber, ifNumberIsSimple);

        if (ifNumberIsSimple == true) {
            System.out.println("Number " + intNumber + " is simple number");
        } else {
            System.out.println("Number " + intNumber + " is NOT simple number");
        }


    }

    public static boolean checkNumberIsSimple(int intNumber, boolean ifNumberIsSimple)  {
        for (int i = 2; i < intNumber; i++) {
            if (intNumber % i == 0) {
              //  System.out.println("Number " + intNumber + " is NOT simple number");
                ifNumberIsSimple = false;
                return ifNumberIsSimple;
            }

        }
        return (ifNumberIsSimple = true);
    }



        public static int checkScannerIntNumber (Scanner sc1,int intNumber){
            System.out.print("Input int number but NOT ZERO: ");
            if (sc1.hasNextInt()) {
                intNumber = sc1.nextInt();

            } else {
                System.out.println("You input wrong number, try again");

            }
            return intNumber;
        }

    }

