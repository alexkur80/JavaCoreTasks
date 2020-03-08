/**
 * This class generate int type Array, Check out if Array is Ascending sort or not.
 *
 * @author Kurlovich Alexander
 * @param int lowRandomElement - low number of random element
 * @param int highRandomElement  - high number of random element
 * @param int countElementsArray  -  count arrays elements
 * @param boolean ifArrayAscending = true - default array is  Ascending sorted.
 * @return Output if array is in Ascending more or not.
 */

package com.myproject.lection03;

import java.util.Random;

public class Lection03Task04 {

    public static void main(String[] args) {
        int lowRandomElement = 10;
        int highRandomElement = 99;
        int countElementsArray = 3;
        boolean ifArrayAscending = true;

        int intArray[] = new int[countElementsArray];
        Random randomElement = new Random();

        for (int i = 0; i < countElementsArray; i++) {
            intArray[i] = randomElement.nextInt(highRandomElement - lowRandomElement + 1) + lowRandomElement;
            System.out.print(intArray[i] + " ");
        }

        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    ifArrayAscending = false;
                    break;
                }

            }
        }

        if (ifArrayAscending == false) {
            System.out.println("\nArray is NOT in Ascending sort");

        } else {
            System.out.println("\nArray is in Ascending sort");

        }

    }
}
