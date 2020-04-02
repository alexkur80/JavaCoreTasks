/**
 * This class gets Number of days in the year,
 * number of current days in this year,
 * get difference and count how many days until 1st of January of the next year.
 */

package com.myproject.lection30;

import com.myproject.utils.ApplicationLogger;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SetDateNextFirstJan implements TemporalAdjuster {

    @Override
    public void setNewDate() {
        LocalDate today = LocalDate.now();

        int daysInYear = today.lengthOfYear();
        int todayIsDay = today.getDayOfYear();
        int leftDays = daysInYear - todayIsDay + 1;
        ApplicationLogger.LOGGER.info("Today is " + today);
        ApplicationLogger.LOGGER.info("There are " + daysInYear + " days in this year");
        ApplicationLogger.LOGGER.info("Today is " + todayIsDay + "th day of the year");
        ApplicationLogger.LOGGER.info("There are  left " + leftDays + " days until 01 Jan of the next year");

        LocalDate newDate = today.plus(leftDays + 1, ChronoUnit.DAYS);
        ApplicationLogger.LOGGER.info("Changed date for the soonest 1st Jan is " + newDate);

    }
}
