/**
 * This class have Utility methods to work with Time and Date.
 */

package com.myproject.lection30;

import com.myproject.utils.ApplicationLogger;
import org.junit.Test;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;


public class DateUtil {

    // JUnit test passed
    public static void getFixedDateFormatted() {
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("dd.MM.yyyy"));

        ApplicationLogger.LOGGER.info("Fixed date: " + fixedDate.format(formatter));
    }


    // JUnit test passed
    public static void getPlusThreeMonths() {
        LocalDate today = LocalDate.now();
        LocalDate todayPlusMonths = today.plus(3, ChronoUnit.MONTHS);

        ApplicationLogger.LOGGER.info("Local date today: " + today);
        ApplicationLogger.LOGGER.info("Local date plus 3 months: " + todayPlusMonths);
    }


    // JUnit test passed
    public static void getDateFormatted() {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        ApplicationLogger.LOGGER.info("Today date formatted: " + today.format(formatter));
    }


    // JUnit test passed
    public static void getLocalDateFromString(String stringDate) throws DateTimeParseException {
        LocalDate parsedDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        ApplicationLogger.LOGGER.info("Parsed date from string:" + parsedDate.format(formatter));
    }


    // JUnit test passed
    public static void getPeriodOfDates() {
        LocalDate today = LocalDate.now();
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);

        long daysBetweenDates = ChronoUnit.DAYS.between(today, fixedDate);

        ApplicationLogger.LOGGER.info("Between :" + today + " and " + fixedDate + " " + daysBetweenDates + " days");
    }


    // JUnit test passed
    public static void getDurationOfDates() {
        LocalDate today = LocalDate.now();
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);

        LocalDateTime todayMidnight = today.atStartOfDay();
        LocalDateTime fixedDateMidnight = fixedDate.atStartOfDay();

        Duration durationOfDates = Duration.between(todayMidnight, fixedDateMidnight);

        ApplicationLogger.LOGGER.info("Duration between " + today + " midnight and " +
                fixedDate + " midnight : " + durationOfDates.toSeconds() + " seconds");

    }
}
