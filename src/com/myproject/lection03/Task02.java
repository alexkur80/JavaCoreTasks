package com.myproject.lection03;

import java.math.BigDecimal;

/**
 * Makes class and create Overloading methods. Call for methods that calculate and return sum of two fields.
 * Make sum of: two int numbers, two double numbers, two BigDecimal numbers.
 */
class OverloadingOfMethods {

    int sumOverloading(int intNumberA, int intNumberB) {
        return intNumberA + intNumberB;
    }

    double sumOverloading(double doubleNumberA, double doubleNumberB) {
        return doubleNumberA + doubleNumberB;
    }

    BigDecimal sumOverloading(BigDecimal bigDecimalNumberA, BigDecimal bigDecimalNumberB) {
        return bigDecimalNumberA.add(bigDecimalNumberB);
    }
}

public class Task02 {
    public static void main(String[] args) {

        int intNumberA = 50;
        int intNumberB = 120;
        double doubleNumberA = 50.5;
        double doubleNumberB = 35115.45;

        int resultIntNumbers;
        double resultDoubleNumbers;
        BigDecimal resultBigDecimalNumbers;

        BigDecimal bigDecimalNumberA = new BigDecimal("1111111111111111.12312312");
        BigDecimal bigDecimalNumberB = new BigDecimal("2222222222222222.12323243");

        OverloadingOfMethods overloadingObj = new OverloadingOfMethods();

        resultIntNumbers = overloadingObj.sumOverloading(intNumberA, intNumberB);
        System.out.println("Sum of " + intNumberA + " + " + intNumberB + " = "
                + resultIntNumbers);

        resultDoubleNumbers = overloadingObj.sumOverloading(doubleNumberA, doubleNumberB);
        System.out.println("Sum of " + doubleNumberA + " + " + doubleNumberB + " = "
                + resultDoubleNumbers);

        resultBigDecimalNumbers = overloadingObj.sumOverloading(bigDecimalNumberA, bigDecimalNumberB);
        System.out.println("Sum of " + bigDecimalNumberA + " + " + bigDecimalNumberB + " = "
                + resultBigDecimalNumbers);
    }
}