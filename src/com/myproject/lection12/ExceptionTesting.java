package com.myproject.lection12;

import com.myproject.utils.ApplicationLogger;

public class ExceptionTesting {
    static public void main(String[] args) {
        String str = null;
        int intArray[] = {1, 10, 20, 50};
        int amountOfPeople = -5;
        int age = -10;


        try {
            int strLength = str.length();
        } catch (NullPointerException e) {
            ApplicationLogger.LOGGER.error("Catch NullPointerException: " + e);
        }

        try {
            intArray[4] = 99;
        } catch (IndexOutOfBoundsException e) {
            ApplicationLogger.LOGGER.error("Catch IndexOutOfBoundsException: " + e);
        }

        try {

            if (amountOfPeople < 0) {
                throw new ArithmeticException("People number MUST be >0 and not negative");
            }
        } catch (ArithmeticException e) {
            ApplicationLogger.LOGGER.info("Catch ArithmeticException: " + e);
                }

        try {
            UtilsException.ageChecking (age);
        } catch(IllegalAgeException e){
                ApplicationLogger.LOGGER.error("Catch my own IllegalAgeException: " + e);
            }










        }





}

