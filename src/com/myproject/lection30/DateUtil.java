/**
 * This class have Utility methods to work with Time and Date.
 */

package com.myproject.lection30;

import com.myproject.utils.ApplicationLogger;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DateUtil {


    public static void getFixedDateFormatted() {
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("dd.MM.yyyy"));

        ApplicationLogger.LOGGER.info("Fixed date: " + fixedDate.format(formatter));

    }


    public static void getPlusThreeMonths() {
        LocalDate today = LocalDate.now();
        LocalDate todayPlusMonths = today.plus(3, ChronoUnit.MONTHS);

        ApplicationLogger.LOGGER.info("Local date today: " + today);
        ApplicationLogger.LOGGER.info("Local date plus 3 months: " + todayPlusMonths);

    }


    public static void getDateFormatted() {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        ApplicationLogger.LOGGER.info("Today date formatted: " + today.format(formatter));

    }


    public static void getLocalDateFromString(String stringDate) throws DateTimeParseException {
        LocalDate parsedDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        ApplicationLogger.LOGGER.info("Parsed date from string:" + parsedDate);

    }

    public static void getPeriodOfDates() {
        LocalDate today = LocalDate.now();
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);

        Period periodOfDates = Period.between(today, fixedDate);
        int days = periodOfDates.getDays();
        int months = periodOfDates.getMonths();
        int years = periodOfDates.getYears();

        if (years == 0 && months == 0 && days == 0) {
            ApplicationLogger.LOGGER.info("Periods equal");
        } else if (years == 0) {
            ApplicationLogger.LOGGER.info("Period between " + today + " and " + fixedDate + " : " +
                    months + " months " + days + " days");
        } else if (months == 0) {
            ApplicationLogger.LOGGER.info("Period between " + today + " and " + fixedDate + " : " + years + " years " +
                    days + " days");
        } else if (days == 0) {
            ApplicationLogger.LOGGER.info("Period between " + today + " and " + fixedDate + " : " + years + " years" +
                    months + " months");
        } else {
            ApplicationLogger.LOGGER.info("Period between " + today + " and " + fixedDate + " : " + years + " years " +
                    months + " months " + days + " days");
        }
    }


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
