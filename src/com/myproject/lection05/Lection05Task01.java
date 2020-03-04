/**
 * This class accepts two INT, DOUBLE. Initialize class object by two numbers (it should have 3 Constructors).
 * Make Overloading of constructors and create method that return result of math operation.
 * In this code returns A + B
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

class OverloadingOfMethods2 {
    int intNumberA;
    int intNumberB;
    double doubleNumberA;
    double doubleNumberB;
    BigDecimal bigDecimalNumberA;
    BigDecimal bigDecimalNumberB;

    OverloadingOfMethods2(int intNumberA, int intNumberB) {
        this.intNumberA = intNumberA;
        this.intNumberB = intNumberB;
    }

    OverloadingOfMethods2(double doubleNumberA, double doubleNumberB) {
        this.doubleNumberA = doubleNumberA;
        this.doubleNumberB = doubleNumberB;
    }

    OverloadingOfMethods2(BigDecimal bigDecimalNumberA, BigDecimal bigDecimalNumberB) {
        this.bigDecimalNumberA = bigDecimalNumberA;
        this.bigDecimalNumberB = bigDecimalNumberB;
    }


    int intMethod() {
        int result = 0;
        result = intNumberA + intNumberB;

        return result;
    }

    double doubleMethod() {
        double result = 0;
        result = doubleNumberA + doubleNumberB;

        return result;
    }

    BigDecimal bigDecimalMethod() {
        BigDecimal result = null;
        result = bigDecimalNumberA.add(bigDecimalNumberB);

        return result;

    }
}

public class Lection05Task01 {
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

        OverloadingOfMethods2 intOverloadingObj = new OverloadingOfMethods2(intNumberA, intNumberB);
        OverloadingOfMethods2 doubleOverloadingObj = new OverloadingOfMethods2(doubleNumberA, doubleNumberB);
        OverloadingOfMethods2 bigDecimalOverloadingObj = new OverloadingOfMethods2(bigDecimalNumberA, bigDecimalNumberB);

        resultIntNumbers = intOverloadingObj.intMethod();
        System.out.println("Sum of " + intNumberA + " + " + intNumberB + " = "
                + resultIntNumbers);

        resultDoubleNumbers = doubleOverloadingObj.doubleMethod();
        System.out.println("Sum of " + doubleNumberA + " + " + doubleNumberB + " = "
                + resultDoubleNumbers);

        resultBigDecimalNumbers = bigDecimalOverloadingObj.bigDecimalMethod();
        System.out.println("Sum of " + bigDecimalNumberA + " + " + bigDecimalNumberB + " = "
                + resultBigDecimalNumbers);

    }
}


