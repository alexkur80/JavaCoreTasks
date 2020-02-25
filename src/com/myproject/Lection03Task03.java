/**
 *  This class generate double type Array, sort it, output MIN element, MAX element, Average Sum.
 *
 * @author  Kurlovich Alexander
 * @param  int lowRandomElement - low number of random element
 * @param  int highRandomElement  - high number of random element
 * @param  int countElementsArray  -  count arrays elements
 *
 * @return  Output sort Array, MIn element, MAX element, Avarage Sum.
 *
 *
 */

package com.myproject;

import java.util.Random;

public class Lection03Task03 {

    public static void main(String[] args) {

        int lowRandomElement = 10;
        int highRandomElement = 20;
        int countElementsArray = 5;
        double sumAllElementsArray = 0;

        double elementsArray[] = new double[countElementsArray];
        Random randomElement = new Random();

        System.out.println ("There are list of " + countElementsArray + " double type random generated numbers: ");

        for (int i = 0; i < elementsArray.length; i++) {
            elementsArray[i] = (lowRandomElement + (highRandomElement - lowRandomElement) * randomElement.nextDouble());
            System.out.println(elementsArray[i] + " ");
        }

// Sorting using Bubble algorithm

        for (int i = elementsArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (elementsArray[j] > elementsArray[j + 1]) {
                    double tmp = elementsArray[j];
                    elementsArray[j] = elementsArray[j + 1];
                    elementsArray[j + 1] = tmp;
                }
            }
        }

        System.out.println("\nWe have sorted Array by bubble algorithm:");

        for (int i = 0; i < elementsArray.length; i++) {
            System.out.println(elementsArray[i]);
            sumAllElementsArray = sumAllElementsArray + elementsArray[i];
        }


        System.out.println("\nMIN element of Array is:" + elementsArray[0]);
        System.out.println("MAX element of Array is:" + elementsArray[elementsArray.length - 1]);
        System.out.println("AVERAGE amount is: " + sumAllElementsArray / countElementsArray);


    }
}
