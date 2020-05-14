package com.myproject.lection02;

import static com.myproject.utils.Utils.checkScannerIntNumberNew;

/**
 * Describes time with 3 arguments: hours, minutes, seconds.
 * Create  two Constructors for class GetTime.
 * First constructor (GetTime(int seconds)) - accept just seconds from console
 * Second constructor (GetTime(int hours, int minutes, int seconds)) - accept hours, minutes, seconds from console
 * Then first output: seconds convert into Days, hours, minutes, seconds for correct output form
 * second output: hours, minutes, seconds convert back to seconds and then convert back into hours, minutes, sec.
 * It makes for correct output form. For example - it user input " 6 hours 98 minutes 196 seconds" - this is not
 * correct format. It converts into "0 Days 7 hours 41 minutes 16 seconds".
 *
 * <p>
 * Output result using methods:
 * outputFirstMethod
 * outputSecondMethod
 * <p>
 * use checkScannerIntNumberNew (Scanner sc1, String invitation) method from Util  for input form.
 *
 * @return First result - output seconds
 */
class GetTime {
     private int hours;
    private int minutes;
    private int seconds;

    GetTime(int seconds) {
        this.seconds = seconds;
    }

    GetTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /**
     * Accepts number of seconds in form: NNNNNNN sec.
     * Then converts number to Days, hours, minutes, seconds for readable form.
     * Example:
     * User input: 20715 seconds.
     * You entered: 0d 5h 45m 15s that's EQUAL 20715 seconds
     * <p>
     * User input: Input hours: 5
     * Input minutes: 45
     * Input seconds: 15
     * You entered: 0d 5h 45m 15s that's EQUAL 20715 seconds
     * <p>
     * 1 day = 24 * 3600 seconds
     * 1 hour = 3600 seconds
     * 1 minute = 60 seconds
     */
    protected void convertSecondsToDaysHoursMinutesSecondsAndOutput(int seconds) {
        this.setSeconds(seconds);
        int daysTmp = this.getSeconds() / (24 * 3600);
        int hoursTmp = (this.getSeconds() % (24 * 3600)) / 3600;
        int minutesTmp = (((this.getSeconds() % (24 * 3600)) % 3600) / 60);
        int secondsTmp = (((this.getSeconds() % (24 * 3600)) % 3600) % 60);

        System.out.print("You entered: " + daysTmp + "d " + hoursTmp + "h " + minutesTmp + "m " + secondsTmp + "s");
        System.out.println(" that's EQUAL " + this.getSeconds() + " seconds");
    }
}

public class Task01 {

    public static void main(String[] args) {
        GetTime timeOne = new GetTime(checkScannerIntNumberNew("Input seconds: "));

        int hours = checkScannerIntNumberNew("Input hours: ");
        int minutes = checkScannerIntNumberNew("Input minutes: ");
        int seconds = checkScannerIntNumberNew("Input seconds: ");
        int secondsFromHoursMinutesSeconds = (hours * 3600 + minutes * 60 + seconds);

        GetTime timeTwo = new GetTime(hours, minutes, seconds);
        timeTwo.setSeconds(secondsFromHoursMinutesSeconds);

        timeOne.convertSecondsToDaysHoursMinutesSecondsAndOutput(timeOne.getSeconds());
        timeTwo.convertSecondsToDaysHoursMinutesSecondsAndOutput(timeTwo.getSeconds());
    }
}