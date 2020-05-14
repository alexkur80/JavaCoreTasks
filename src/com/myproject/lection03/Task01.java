package com.myproject.lection03;

import java.math.BigDecimal;

/**
 * Accepts two INT, two DOUBLE, two BIGDECIMAL numbers and initialized right after object created
 * Make Peregruzka of methods, that should return result of math operation. In this code returns A + B
 */
class Overloading {
    private int intNumberA;
    private int intNumberB;
    private double doubleNumberA;
    private double doubleNumberB;
    private BigDecimal bigDecimalNumberA;
    private BigDecimal bigDecimalNumberB;

    Overloading(int intNumberA, int intNumberB) {
        this.intNumberA = intNumberA;
        this.intNumberB = intNumberB;
    }

    Overloading(double doubleNumberA, double doubleNumberB) {
        this.doubleNumberA = doubleNumberA;
        this.doubleNumberB = doubleNumberB;
    }

    Overloading(BigDecimal bigDecimalNumberA, BigDecimal bigDecimalNumberB) {
        this.bigDecimalNumberA = bigDecimalNumberA;
        this.bigDecimalNumberB = bigDecimalNumberB;
    }

    public int getIntNumberA() {
        return intNumberA;
    }

    public void setIntNumberA(int intNumberA) {
        this.intNumberA = intNumberA;
    }

    public int getIntNumberB() {
        return intNumberB;
    }

    public void setIntNumberB(int intNumberB) {
        this.intNumberB = intNumberB;
    }

    public double getDoubleNumberA() {
        return doubleNumberA;
    }

    public void setDoubleNumberA(double doubleNumberA) {
        this.doubleNumberA = doubleNumberA;
    }

    public double getDoubleNumberB() {
        return doubleNumberB;
    }

    public void setDoubleNumberB(double doubleNumberB) {
        this.doubleNumberB = doubleNumberB;
    }

    public BigDecimal getBigDecimalNumberA() {
        return bigDecimalNumberA;
    }

    public void setBigDecimalNumberA(BigDecimal bigDecimalNumberA) {
        this.bigDecimalNumberA = bigDecimalNumberA;
    }

    public BigDecimal getBigDecimalNumberB() {
        return bigDecimalNumberB;
    }

    public void setBigDecimalNumberB(BigDecimal bigDecimalNumberB) {
        this.bigDecimalNumberB = bigDecimalNumberB;
    }

    int intMethod() {
        int result;
        result = getIntNumberA() + getIntNumberB();
        return result;
    }

    double doubleMethod() {
        double result;
        result = getDoubleNumberA() + getDoubleNumberB();
        return result;
    }

    BigDecimal bigDecimalMethod() {
        BigDecimal result;
        result = getBigDecimalNumberA().add(getBigDecimalNumberB());
        return result;
    }
}


public class Task01 {

    public static void main(String[] args) {
        BigDecimal bigDecimalNumberA = new BigDecimal("1111111111111111.12312312");
        BigDecimal bigDecimalNumberB = new BigDecimal("2222222222222222.12323243");

        int intNumberA = 50;
        int intNumberB = 120;
        double doubleNumberA = 50.5;
        double doubleNumberB = 35115.45;
        Overloading intPerezagruzkaObj = new Overloading(intNumberA, intNumberB);
        Overloading doublePerezagruzkaObj = new Overloading(doubleNumberA, doubleNumberB);
        Overloading bigDecimalPerezagruzkaObj = new Overloading(bigDecimalNumberA, bigDecimalNumberB);

        int resultIntNumbers;
        resultIntNumbers = intPerezagruzkaObj.intMethod();
        System.out.println("Sum of " + intNumberA + " + " + intNumberB + " = "
                + resultIntNumbers);

        double resultDoubleNumbers;
        resultDoubleNumbers = doublePerezagruzkaObj.doubleMethod();
        System.out.println("Sum of " + doubleNumberA + " + " + doubleNumberB + " = "
                + resultDoubleNumbers);

        BigDecimal resultBigDecimalNumbers;
        resultBigDecimalNumbers = bigDecimalPerezagruzkaObj.bigDecimalMethod();
        System.out.println("Sum of " + bigDecimalNumberA + " + " + bigDecimalNumberB + " = "
                + resultBigDecimalNumbers);
    }
}