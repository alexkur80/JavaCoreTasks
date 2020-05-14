package com.myproject.lection30;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Implements interface TemporalAdjuster and Override method
 * setNewDate. It adds number of days from Constructor to current date and output
 * new date.
 */
public class AddDays implements TemporalAdjuster {
    private int addDays;
    private LocalDate today;
    private LocalDate todayPlusDays;

    AddDays(int addDays) {
        this.addDays = addDays;
    }

    public void setAddDays(int addDays) {
        this.addDays = addDays;
    }

    /**
     * Realizes interface TemporalAdjuster that add to current date 'n' days
     * JUnit test passed
     */
    @Override
    public void setNewDate() {
        this.today = LocalDate.now();
        this.todayPlusDays = today.plus(this.addDays, ChronoUnit.DAYS);
    }

    @Override
    public String toString() {
        return "Today is " + this.today + " Today plus " + +this.addDays + " days : " + this.todayPlusDays;
    }
}