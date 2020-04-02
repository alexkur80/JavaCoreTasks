/**
 * This class shows classes and methods working with date, time:
 * LocalDate, Local time, Period, Duration
 *
 * @author Kurlovich Alexander
 * @version Lection30  Date API
 * @date 04/02/2020
 */

package com.myproject.lection30;

import com.myproject.utils.ApplicationLogger;

import java.time.format.DateTimeParseException;

public class DataApiMain {

    public static void main(String[] args) {

        DateUtil.getFixedDateFormatted();

        DateUtil.getPlusThreeMonths();

        DateUtil.getDateFormatted();

        String stringDate = "26-03-2014";
        try {
            DateUtil.getLocalDateFromString(stringDate);
        } catch (DateTimeParseException e) {
            ApplicationLogger.LOGGER.error("Incorrect date format");
            e.printStackTrace();
        }

        DateUtil.getPeriodOfDates();

        DateUtil.getDurationOfDates();

        int addDays = 42;
        AddDays addTodayDays = new AddDays(addDays);
        addTodayDays.setNewDate();

        SetDateNextFirstJan changeDate = new SetDateNextFirstJan();
        changeDate.setNewDate();

    }

}
