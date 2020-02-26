package com.myproject;

import java.util.Scanner;

class GetTime {
    int hours;
    int minutes;
    int seconds;

    void outputFirstMethod() {
        System.out.println("You entered: " + this.seconds + "s");
    }

    void outputSecondMethod() {
        System.out.println("You entered: " + this.hours + "h " + this.minutes + "m " + this.seconds + "s ");
    }


    GetTime(int seconds) {
        this.seconds = seconds;
    }

    GetTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }


}

public class Lection04Task01 {

    public static void main(String[] agrs) {

        Scanner sc01 = new Scanner(System.in);
        Scanner sc02 = new Scanner(System.in);
        Scanner sc03 = new Scanner(System.in);

        System.out.print("Input seconds: ");
        GetTime timeOne = new GetTime(sc01.nextInt());


        System.out.print("Input hours: ");
        int hours = sc01.nextInt();

        System.out.print("Input minutes: ");
        int minutes = sc02.nextInt();

        System.out.print("Input seconds: ");
        int seconds = sc03.nextInt();

        GetTime timeTwo = new GetTime(hours, minutes, seconds);

        timeOne.outputFirstMethod();
        timeTwo.outputSecondMethod();

    }

}
