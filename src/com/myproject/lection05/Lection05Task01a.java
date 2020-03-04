/**
 * Make class and create Overloading methods. Call for methods that calculate and return sum of two fields.
 * Make sum of: two int numbers, two double numbers, two BigDecimal numbers.
 *
 *
 * @author Kurlovich Alexander
 * @version Lection04Task02
 * @param int intNumberA; int intNumberB
 * @param int intNumberA; int intNumberB
 * @param double doubleNumberA;
 * @param double doubleNumberB;
 * @param BigDecimal bigDecimalNumberA
 * @param BigDecimal bigDecimalNumberB
 * @return SUM of two numbers (int, double, BigDecimal)
 */

package com.myproject.lection05;

import java.math.BigDecimal;

class OverloadingOfMethods {

    int summOverloading(int intNumberA, int intNumberB) {
        int result = 0;
        result = intNumberA + intNumberB;

        return result;
    }

    double summOverloading(double doubleNumberA, double doubleNumberB) {
        double result = 0;
        result = doubleNumberA + doubleNumberB;

        return result;
    }

    BigDecimal summOverloading(BigDecimal bigDecimalNumberA, BigDecimal bigDecimalNumberB) {
        BigDecimal result = null;
        result = bigDecimalNumberA.add(bigDecimalNumberB);

        return result;

    }
}

public class Lection05Task01a {
    public static void main(String[] args) {

        int intNumberA = 50;
        int intNumberB = 120;
        double doubleNumberA = 50.5;
        double doubleNumberB = 35115.45;

        int resultIntNumbers = 0;
        double resultDoubleNumbers = 0;
        BigDecimal resultBigDecimalNumbers = null;

        BigDecimal bigDecimalNumberA = new BigDecimal("1111111111111111.12312312");
        BigDecimal bigDecimalNumberB = new BigDecimal("2222222222222222.12323243");

        OverloadingOfMethods overloadingObj = new OverloadingOfMethods();

        resultIntNumbers = overloadingObj.summOverloading(intNumberA, intNumberB);
        System.out.println("Sum of " + intNumberA + " + " + intNumberB + " = "
                + resultIntNumbers);

        resultDoubleNumbers = overloadingObj.summOverloading(doubleNumberA, doubleNumberB);
        System.out.println("Sum of " + doubleNumberA + " + " + doubleNumberB + " = "
                + resultDoubleNumbers);

        resultBigDecimalNumbers = overloadingObj.summOverloading(bigDecimalNumberA, bigDecimalNumberB);
        System.out.println("Sum of " + bigDecimalNumberA + " + " + bigDecimalNumberB + " = "
                + resultBigDecimalNumbers);

    }
}


