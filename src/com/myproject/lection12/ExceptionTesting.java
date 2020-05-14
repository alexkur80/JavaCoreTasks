package com.myproject.lection12;

import org.apache.log4j.Logger;

public class ExceptionTesting {
    public final static Logger LOGGER = Logger.getLogger(ExceptionTesting.class);

    static public void main(String[] args) {

        LOGGER.info("This Class testing opportunities of Exceptions in Java");

        /* Produces and catches  NullPointerException by using method on null: null.length() */

        String str = null;
        try {
            str.length();
        } catch (NullPointerException npe) {
            LOGGER.error("Catch JDK Exception " + npe);
        }

        /* Catches IndexOutOfBoundsException by indexing not existing element intArray[5] */

        UtilsException.ownWrittenArrayIndexOutOfBoundsException();

        /* 'numberOfPeople' should be positive, otherwise catch ArithmeticException */

        int numberOfPeople = -5;
        try {
            if (numberOfPeople < 0) {
                throw new ArithmeticException("People number MUST BE POSITIVE (>0) ONLY");
            }
        } catch (ArithmeticException ae) {
            LOGGER.error("Catch JDK Exception- " + ae);
        }

        /* for normal "age" should be from 18 to 100, otherwise catch IllegalAgeException
        ageChecking(int age) throw IllegalAgeException  if age < 18 || age > 100 */

        int age = 17;
        try {
            UtilsException.ageChecking(age);
        } catch (IllegalAgeException iae) {
            LOGGER.error("Catch my own-written CHECKED - " + iae);
        }

        /* isZeroChecking(int number) throwIsZeroException if number == 0*/
        int number = 0;
        try {
            UtilsException.isZeroChecking(number);
        } catch (IsZeroRuntimeException ize) {
            LOGGER.error("Catch my own-written UNCHECKED  - " + ize);
        }

        /* This part of code have method " randomThrowsException() "
        that throws RANDOM Exception and catch necessary Exception. */

        try {
            UtilsException.randomThrowsException();
        } catch (ArithmeticException ae) {
            LOGGER.error("Catch ArithmeticException - " + ae);
        } catch (NullPointerException npe) {
            LOGGER.error("Catch NullPointerException - " + npe);
        } catch (IsZeroRuntimeException ize) {
            LOGGER.error("Catch my own-written UNCHECKED IsZeroRuntimeException - " + ize);
        }

        /* Метод, который в 50% случаев бросает исключение. Вся реализация внутри */

        UtilsException.percent50Exception();

        /* Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
         указав в качестве причины отловленное. Выполнить блок try-catch-finally */

        try {
            throw new NullPointerException();
        } catch (NullPointerException npe) {
            UtilsException.reCatchException(npe);
            LOGGER.error(npe);
        } finally {
            LOGGER.info("FINISH");
        }
    }
}