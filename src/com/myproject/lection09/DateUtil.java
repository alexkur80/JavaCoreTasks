package com.myproject.lection09;

import org.apache.log4j.Logger;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;


public class DateUtil {
    private static Logger LOGGER = Logger.getLogger(DateUtil.class);

    /**
     * Outputs fixed date using formatter and output in console
     * JUnit passed
     */
    public static void getFixedDateFormatted() {
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("dd.MM.yyyy"));

        LOGGER.info("Fixed date: " + fixedDate.format(formatter));
    }

    /**
     * Creates today's date object.
     * Adds new object adding 3 months to current date
     * JUnit test passed
     */
    public static void getPlusThreeMonths() {
        LocalDate today = LocalDate.now();
        LocalDate todayPlusMonths = today.plus(3, ChronoUnit.MONTHS);

        LOGGER.info("Local date today: " + today);
        LOGGER.info("Local date plus 3 months: " + todayPlusMonths);
    }

    /**
     * Formats current date to dd.MM.yyyy
     * JUnit test passed
     */
    public static void getDateFormatted() {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LOGGER.info("Today date formatted: " + today.format(formatter));
    }

    //        String stringDate = "26-03-2014";
    //

    /**
     * Parses String date and put this date in  LocalDate obj
     * JUnit test passed
     *
     * @param stringDate String with data using format like 26-03-2014
     * @throws DateTimeParseException if text date format is incorrect
     */
    public static void getLocalDateFromString(String stringDate) throws DateTimeParseException {
        LocalDate parsedDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LOGGER.info("Parsed date from string:" + parsedDate.format(formatter));
    }

    /**
     * Calculates days between two dates
     * JUnit test passed
     */
    public static void getPeriodOfDates() {
        LocalDate today = LocalDate.now();
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);

        long daysBetweenDates = ChronoUnit.DAYS.between(today, fixedDate);
        LOGGER.info("Between :" + today + " and " + fixedDate + " " + daysBetweenDates + " days");
    }

    /**
     * Calculates seconds between midnights of two days
     * JUnit test passed
     */
    public static void getDurationOfDates() {
        LocalDate today = LocalDate.now();
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);

        LocalDateTime todayMidnight = today.atStartOfDay();
        LocalDateTime fixedDateMidnight = fixedDate.atStartOfDay();

        Duration durationOfDates = Duration.between(todayMidnight, fixedDateMidnight);

        LOGGER.info("Duration between " + today + " midnight and " +
                fixedDate + " midnight : " + durationOfDates.toSeconds() + " seconds");
    }
}