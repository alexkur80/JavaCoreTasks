package com.myproject.lection03;

import java.util.Random;

/**
 * Fills random Array and output elements in Ascending Order and Descending Order
 */
public class Task01 {

    /**
     * int highRandomElement  - high number of random element <p>
     * int countElementsArray  -  count arrays elements <p>
     * <p>
     * Output All elements of array in ascending and descending order.
     */
    public static void main(String[] args) {
        int countElementsArray = 10;
        int[] elementsArray = new int[countElementsArray];

        Random randomElement = new Random();

        System.out.print("Output elements of array in Ascending  order: ");

        int highRandomElement = 50;
        for (int i = 0; i < elementsArray.length; i++) {
            elementsArray[i] = randomElement.nextInt(highRandomElement);
            System.out.print(elementsArray[i] + " ");
        }

        System.out.print("\nOutput elements of array in Descending  order: ");
        for (int i = elementsArray.length - 1; i >= 0; i--) {
            System.out.print(elementsArray[i] + " ");

        }
    }
}