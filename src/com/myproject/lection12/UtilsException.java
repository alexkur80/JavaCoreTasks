/**
 * Utils methods
 *
 * @param static void ageChecking(int age). It uses IllegalAgeException extends Exception (CHECKED)
 * check age range. Normal range  is 18 till 100, otherwise throw IllegalAgeException.
 * <p>
 * @param static void isZeroChecking(int number) It uses sfZeroException extends RuntimeException (UNCHECKED)
 * if number == 0 then throw IfZeroException ArithmeticException, NullPointerException,
 * IfZeroException
 * <p>
 * @param public static void randomThrowsException() It generates one of three Exceptions and catch it.
 * @param public static void percent50Exception() Generates Exceptions in 50% of cases
 * @param public static void reCatchException(Exception e)  - this method re-catch JDK Exception
 * anb throw OWn Exception instead with reason of Exception. It accepts as argument
 * object of JDK Exception.
 * @author Kurlovich Alexander
 * @version Lection12 Exceptions
 */


package com.myproject.lection12;

import com.myproject.utils.ApplicationLogger;

import java.util.Random;

public class UtilsException {


    public static void ageChecking(int age) throws IllegalAgeException {
        if (age < 18 || age > 100) {
            throw new IllegalAgeException(" years if out of range. Must be from 18 to 100", age);
        }
    }


    public static void isZeroChecking(int number) {
        if (number == 0) {
            throw new IsZeroException(" is ZERO, try another number", number);
        }
    }


    public static void randomThrowsException() throws ArithmeticException,
            NullPointerException, IsZeroException {
        Random rnd = new Random();
        int rndEcxeption = rnd.nextInt(3);

        switch (rndEcxeption) {
            case 0:
                throw new ArithmeticException();
            case 1:
                throw new NullPointerException();
            case 2:
                throw new IsZeroException();
        }
    }


    public static void percent50Exception() {
        int number = 10;
        for (int i = 2; i <= 10; i++) {
            try {
                if (i % 2 == 0) {
                    throw new ArithmeticException("50 percent cases Exception");
                }
            } catch (ArithmeticException e) {
                ApplicationLogger.LOGGER.error("Catch JDK - " + e);
            }
        }
    }


    public static void reCatchException(Exception e) {
        try {
            throw new MyDefaultException("Re-catching instead of " + e);
        } catch (MyDefaultException e2) {
            ApplicationLogger.LOGGER.error("Catch MY_OWN CHECKED - " + e2);
        }
    }

}

