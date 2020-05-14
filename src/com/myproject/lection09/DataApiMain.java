package com.myproject.lection09;

import org.apache.log4j.Logger;

import java.time.format.DateTimeParseException;

public class DataApiMain {
    private static Logger LOGGER = Logger.getLogger(DataApiMain.class);

    public static void main(String[] args) {

        DateUtil.getFixedDateFormatted();

        DateUtil.getPlusThreeMonths();

        DateUtil.getDateFormatted();

        String stringDate = "26-03-2014";
        try {
            DateUtil.getLocalDateFromString(stringDate);
        } catch (DateTimeParseException dtpe) {
            LOGGER.error("Incorrect date format " + dtpe);
        }

        DateUtil.getPeriodOfDates();

        DateUtil.getDurationOfDates();

        /* adds 42 days to current date */

        int addDays = 42;
        AddDays addTodayDays = new AddDays(addDays);
        addTodayDays.setNewDate();
        LOGGER.info(addTodayDays);

        /* changes date for 1st of Jan*/

        SetDateNextFirstJan changeDate = new SetDateNextFirstJan();
        changeDate.setNewDate();
    }
}