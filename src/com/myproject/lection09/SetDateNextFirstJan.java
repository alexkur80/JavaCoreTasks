package com.myproject.lection09;

import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SetDateNextFirstJan implements TemporalAdjuster {
    private static Logger LOGGER = Logger.getLogger(SetDateNextFirstJan.class);

    /**
     * Changes date for the next first 1st of Jan
     */
    @Override
    public void setNewDate() {
        LocalDate today = LocalDate.now();

        int daysInYear = today.lengthOfYear();
        int todayIsDay = today.getDayOfYear();
        int leftDays = daysInYear - todayIsDay;
        LOGGER.info("Today is " + today);
        LOGGER.info("There are " + daysInYear + " days in this year");
        LOGGER.info("Today is " + todayIsDay + "th day of the year");
        LOGGER.info("There are  left " + leftDays + " days until 01 Jan of the next year");

        LocalDate newDate = today.plus(leftDays + 1, ChronoUnit.DAYS);
        LOGGER.info("Changed date for the soonest 1st Jan is " + newDate);
    }
}