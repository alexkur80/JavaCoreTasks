package com.myproject;

import java.util.Scanner;

import static com.myproject.Utils.checkScannerIntNumber;


public class Lection03Task08 {

    public static void main(String[] args) {
        int intNumber = 0;
        Scanner sc = new Scanner(System.in);

        intNumber = checkScannerIntNumber(sc, intNumber);

        int countElementsArray = intNumber;

        int[] intPositiveArray = new int [countElementsArray];

    }
}
