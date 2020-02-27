/**
 * This class describe time with 3 arguments: hours, minutes, seconds.
 * Create  two Constructors for class GetTime.
 * First constructor (GetTime(int seconds)) - accept just seconds from console
 * Second constructor (GetTime(int hours, int minutes, int seconds)) - accept hours, minutes, seconds from console
 * Then first output: seconds convert into Days, hours, minutes, seconds for correct output form
 *      second output: hours, minutes, seconds convert back to seconds and then convert back into hours, minutes, sec.
 *      It makes for correct output form. For example - it user input " 6 hours 98 minutes 196 seconds" - this is not
 *      correct format. It converts into "0 Days 7 hours 41 minutes 16 seconds".
 *
 * @author Kurlovich Alexander
 * @return First result - output seconds
 * @see  public static int checkScannerIntNumberNew (Scanner sc1, String invitation) in Util class
 *
 * Output result using methods:
 *      outputFirstMethod
 *      outputSecondMethod
 *
 *  use checkScannerIntNumberNew (Scanner sc1, String invitation) method from Util  for input form.
 *
 */

package com.myproject;

import java.util.Scanner;

import static com.myproject.Utils.*;

class GetTime {
    int hours;
    int minutes;
    int seconds;


// Constructor #1 with one argument

    GetTime(int seconds) {
        this.seconds = seconds;
    }

// Constructor #2 with three arguments

    GetTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    /*  This METHOD accepts number of seconds in form: NNNNNNN sec.
    Then converts number to Days, hours, minutes, seconds for readable form.
    Example:
    User input: 20715 seconds.
    You entered: 0d 5h 45m 15s that's EQUAL 20715 seconds

    User input: Input hours: 5
                Input minutes: 45
                Input seconds: 15
                You entered: 0d 5h 45m 15s that's EQUAL 20715 seconds


    1 day = 24 * 3600 seconds
    1 hour = 3600 seconds
    1 minute = 60 seconds

  */

    void convertSecondsToDaysHoursMinutesSecondsAndOutput(int seconds) {

        this.seconds = seconds;
        int daysTmp = this.seconds / (24 * 3600);
        int hoursTmp = (this.seconds % (24 * 3600)) / 3600;
        int minutesTmp = (((this.seconds % (24 * 3600)) % 3600) / 60);
        int secondsTmp = (((this.seconds % (24 * 3600)) % 3600) % 60);

        System.out.print("You entered: " + daysTmp + "d " + hoursTmp + "h " + minutesTmp + "m " + secondsTmp + "s");
        System.out.println(" that's EQUAL " + this.seconds + " seconds ");


    }

}

public class Lection04Task01 {

    public static void main(String[] agrs) {

        Scanner sc01 = new Scanner(System.in);
        Scanner sc02 = new Scanner(System.in);
        Scanner sc03 = new Scanner(System.in);

        GetTime timeOne = new GetTime(checkScannerIntNumberNew(sc01, "Input seconds: "));

        int hours = checkScannerIntNumberNew(sc01, "Input hours: ");
        int minutes = checkScannerIntNumberNew(sc02, "Input minutes: ");
        int seconds = checkScannerIntNumberNew(sc03, "Input seconds: ");
        int secondsFromHoursMinutesSeconds = (hours * 3600 + minutes * 60 + seconds);

        GetTime timeTwo = new GetTime(hours, minutes, seconds);
        timeTwo.seconds = secondsFromHoursMinutesSeconds;

        timeOne.convertSecondsToDaysHoursMinutesSecondsAndOutput(timeOne.seconds);
        timeTwo.convertSecondsToDaysHoursMinutesSecondsAndOutput(timeTwo.seconds);

    }

}
