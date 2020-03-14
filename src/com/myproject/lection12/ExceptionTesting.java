/**
 * This Class testing Exceptions opportunities
 *
 * @author Kurlovich Alexander
 * @version Lection12 Exceptions
 */


package com.myproject.lection12;

import com.myproject.utils.ApplicationLogger;

public class ExceptionTesting {
    static public void main(String[] args) {

        String str = null;
        int[] intArray = {1, 10, 20, 50};
        // for normal "numberOfPeople" should be positive, otherwise catch ArithmeticException
        int numberOfPeople = -5;
        // for normal "age" should be from 18 to 100, otherwise catch IllegalAgeException
        int age = 17;
        int testifZeroException = 0;

        ApplicationLogger.LOGGER.info("===========================================" +
                "===========");
        ApplicationLogger.LOGGER.info("This Class testing opportunities of Exceptions " +
                "in Java");
        ApplicationLogger.LOGGER.info("===========================================" +
                "===========\n");

        try {
            str.length();
        } catch (NullPointerException e) {
            ApplicationLogger.LOGGER.error("Catch JDK - " + e);
        }

        try {
            intArray[5] = 99;
        } catch (IndexOutOfBoundsException e) {
            ApplicationLogger.LOGGER.error("Catch JDK - " + e);
        }

// немножко самодеятельности ))
        try {
            if (numberOfPeople < 0) {
                throw new ArithmeticException("People number MUST BE POSITIVE (>0) ONLY");
            }
        } catch (ArithmeticException e) {
            ApplicationLogger.LOGGER.error("Catch JDK - " + e);
        }

        try {
            UtilsException.ageChecking(age);
        } catch (IllegalAgeException e) {
            ApplicationLogger.LOGGER.error("Catch MY_OWN CHECKED - " + e);
            e.printStackTrace();
        }


        try {
            UtilsException.isZeroChecking(testifZeroException);
        } catch (IsZeroException e) {
            ApplicationLogger.LOGGER.error("Catch MY_OWN UNCHECKED  - " + e);
        }


// This part of code have method " randomThrowsException() " that throws RANDOM Exception and
// catch necessary Exception.

        try {
            UtilsException.randomThrowsException();
        } catch (ArithmeticException e) {
            ApplicationLogger.LOGGER.error("Catch  JDK Random - " + e);
        } catch (NullPointerException e) {
            ApplicationLogger.LOGGER.error("Catch JDK Random - " + e);
        } catch (IsZeroException e) {
            ApplicationLogger.LOGGER.error("Catch MY_OWN UNCHECKED Random - " + e);
        }

// Метод, который в 50% случаев бросает исключение. Вся реализация внутри
        UtilsException.percent50Exception();

// Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
// указав в качестве причины отловленное. Выполнить блок try-catch-finally
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            UtilsException.reCatchException(e);
        } finally {
            ApplicationLogger.LOGGER.info("FINISH");
        }

    }
}





