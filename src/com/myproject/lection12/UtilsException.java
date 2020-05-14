package com.myproject.lection12;

import org.apache.log4j.Logger;

import java.util.Random;

public class UtilsException {
    public final static Logger LOGGER = Logger.getLogger(UtilsException.class);

    /**
     * Validates age legality
     *
     * @param age from 18 to 100, out of range throws IllegalAgeException
     * @throws IllegalAgeException if age out of range 18 to 100
     */
    public static void ageChecking(int age) throws IllegalAgeException {
        if (age < 18 || age > 100) {
            throw new IllegalAgeException(" years if out of range. Must be from 18 to 100", age);
        }
    }

    /**
     * Checks if number == 0 throw IsZeroRuntimeException
     *
     * @param number int number
     */
    public static void isZeroChecking(int number) {
        if (number == 0) {
            throw new IsZeroRuntimeException(" is ZERO, try another number", number);
        }
    }

    /**
     * Throws random Exception from three Exception: ArithmeticException,
     * NullPointerException, IsZeroRuntimeException
     */
    public static void randomThrowsException() throws ArithmeticException,
            NullPointerException, IsZeroRuntimeException {
        Random rnd = new Random();
        int rndException = rnd.nextInt(3);

        switch (rndException) {
            case 0:
                throw new ArithmeticException();
            case 1:
                throw new NullPointerException();
            case 2:
                throw new IsZeroRuntimeException();
        }
    }

    /**
     * Throws Exception in 50% of cases
     */
    public static void percent50Exception() {
        int numberIterations = 10;
        for (int i = 2; i <= numberIterations; i++) {
            try {
                if (i % 2 == 0) {
                    throw new ArithmeticException("50 percent cases Exception");
                }
            } catch (ArithmeticException e) {
                LOGGER.error("Catch JDK - " + e);
            }
        }
    }

    /**
     * * Re-catches JDK Exception anb throw own-written Exception instead with reason of Exception.
     * It accepts as argument object of JDK Exception.
     *
     * @param e Exceptions which re-catch
     */
    public static void reCatchException(Exception e) {
        try {
            throw new MyDefaultException("Re-catching Exception instead of " + e);
        } catch (MyDefaultException mde) {
            LOGGER.error("Catch MY_OWN CHECKED - " + mde);
        }
    }

    /**
     * Produces and catches ArrayIndexOutOfBoundsException by indexing not existing element intArray[5]
     */
    public static void ownWrittenArrayIndexOutOfBoundsException() {

        int[] intArray = new int[3];
        try {
            intArray[5] = 99;
        } catch (IndexOutOfBoundsException aie) {
            LOGGER.error("Catch JDK ArrayIndexOutOfBoundsException - " + aie);
        }
    }
}