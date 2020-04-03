/**
 * This class has Constructor with parameter   addDays.
 * This class implements interface TemporalAdjuster and Override method
 * setNewDate. It adds number of days from Constructor to current date and output
 * new date.
 */
package com.myproject.lection30;

import com.myproject.utils.ApplicationLogger;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AddDays implements TemporalAdjuster {
    private int addDays;

    public int getAddDays() {
        return addDays;
    }

    AddDays(int addDays) {
        this.addDays = addDays;

    }

    public void setAddDays(int addDays) {
        this.addDays = addDays;
    }

    // JUnit test passed
    @Override
    public void setNewDate() {
        setAddDays(addDays);

        LocalDate today = LocalDate.now();
        LocalDate todayPlusDays = today.plus(this.addDays, ChronoUnit.DAYS);

        ApplicationLogger.LOGGER.info("Today is " + today);
        ApplicationLogger.LOGGER.info("Today plus " + this.addDays + " days : " + todayPlusDays);

    }


}
