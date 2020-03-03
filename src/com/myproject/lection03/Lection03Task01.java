/**
 * This class fill random Array and output elements in Ascending Order and Descending Order
 *
 * @author Kurlovich Alexander
 * @param int highRandomElement  - high number of random element
 * @param int countElementsArray  -  count arrays elements
 * @return All elements of array in ascending and descending order.
 */

package com.myproject.lection03;

import java.util.Random;

public class Lection03Task01 {

    public static void main(String[] args) {

        int countElementsArray = 10;
        int highRandomElement = 50;

        int[] elementsArray = new int[countElementsArray];
        Random randomElement = new Random();

        System.out.print("Output elements of array in Ascending  order:  ");

        for (int i = 0; i < elementsArray.length; i++) {
            elementsArray[i] = randomElement.nextInt(highRandomElement);
            System.out.print(elementsArray[i] + " ");
        }

        System.out.print("\nOutput elements of array in Descending  order: ");

        for (int i = elementsArray.length-1; i>=0; i--) {
            System.out.print(elementsArray[i] + " ");

        }

    }

}
