package com.myproject.lection03;

import java.util.Random;

/**
 * Generates int type Array, Check out if Array is Ascending sort or not.
 */
public class Task04 {

    /**
     * Analise if Array is Ascending sort or not
     * int lowRandomElement - low number of random element <p>
     * int highRandomElement  - high number of random element <p>
     * int countElementsArray  -  count arrays elements <p>
     * boolean ifArrayAscending = true - default array is  Ascending sorted. <p>
     * Output if array is in Ascending more or not.
     */
    public static void main(String[] args) {
        int countElementsArray = 3;

        Random randomElement = new Random();

        int[] intArray = new int[countElementsArray];
        for (int i = 0; i < countElementsArray; i++) {
            int lowRandomElement = 10;
            int highRandomElement = 99;
            intArray[i] = randomElement.nextInt(highRandomElement - lowRandomElement + 1) + lowRandomElement;
            System.out.print(intArray[i] + " ");
        }

        boolean ifArrayAscending = true;
        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    ifArrayAscending = false;
                    break;
                }
            }
        }

        if (!ifArrayAscending) {
            System.out.println("\nArray is NOT in Ascending sort");
        } else {
            System.out.println("\nArray is in Ascending sort");

        }
    }
}