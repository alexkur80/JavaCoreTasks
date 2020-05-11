package com.myproject.lection03;

import java.util.Random;
import java.util.Scanner;

/**
 * Creates method equalArraySelectedElements that define if two elements of two double-sized arrays equal.
 * First we generate Two double-sized arrays and output them. Then user should input Index of element of first array
 * and then index of element of second array. Output if they are equal or not. Organize method
 * equalArraySelectedElements and call it from MAIN method.
 */
public class Task05 {

    /**
     * countStringsElementsArray1  - String size of first double-sized array
     * countRowsElementsArray1  - Row size of first double-sized array
     * countStringsElementsArray2  - String size of second double-sized array
     * countRowsElementsArray2  - Row size of second double-sized array
     * lowRandomElement  - min number of array elements
     * highRandomElement  - max number of array elements
     * Output arrays first and then output if two elements of who arrays are equal. equalArraySelectedElements
     * method output result - if two elements equal or not.
     */
    public static void main(String[] args) {
        int countStringsElementsArray1 = 3;
        int countRowsElementsArray1 = 6;
        int[][] firstArray = new int[countStringsElementsArray1][countRowsElementsArray1];

        int countStringsElementsArray2 = 4;
        int countRowsElementsArray2 = 6;
        int[][] secondArray = new int[countStringsElementsArray2][countRowsElementsArray2];

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        /* Filling random elements firstArray*/

        System.out.println("First Array: ");
        int highRandomElement = 10;
        for (int i = 0; i < countStringsElementsArray1; i++) {
            for (int j = 0; j < countRowsElementsArray1; j++) {
                firstArray[i][j] = rnd.nextInt(highRandomElement);
                secondArray[i][j] = rnd.nextInt(highRandomElement);
                System.out.print(firstArray[i][j] + "\t");
            }
            System.out.print("\n");
        }

        /* Filling random secondArrayToCompare */

        System.out.println("\nSecond Array: ");
        for (int i = 0; i < countStringsElementsArray2; i++) {
            for (int j = 0; j < countRowsElementsArray2; j++) {
                secondArray[i][j] = rnd.nextInt(highRandomElement);
                System.out.print(secondArray[i][j] + "\t");
            }
            System.out.print("\n");
        }

        int index1FirstArrayToCompare = 0;
        System.out.print("Input Index1 Array1: ");
        index1FirstArrayToCompare = sc.nextInt();

        int index2FirstArrayToCompare = 0;
        System.out.print("Input Index2 Array1: ");
        index2FirstArrayToCompare = sc.nextInt();

        int index1SecondArrayToCompare = 0;
        System.out.print("Input Index1 Array2: ");
        index1SecondArrayToCompare = sc.nextInt();

        int index2SecondArrayToCompare = 0;
        System.out.print("Input Index2 Array2: ");
        index2SecondArrayToCompare = sc.nextInt();

        equalArraySelectedElements(firstArray, secondArray, index1FirstArrayToCompare,
                index2FirstArrayToCompare, index1SecondArrayToCompare, index2SecondArrayToCompare);

    }

    /**
     * Compares chosen element of arrays if they equal or not.
     *
     * @param array1       first array
     * @param array2       second array
     * @param index1Array1 index 1 of first array
     * @param index2Array1 index 2 of first array
     * @param index1Array2 index 1 of second array
     * @param index2Array2 index 2 of second array
     *                     Output: Ex: NO, 3 IS NOT EQUAL 5
     */
    public static void equalArraySelectedElements(int[][] array1, int[][] array2, int index1Array1,
                                                  int index2Array1, int index1Array2, int index2Array2) {

        if (array1[index1Array1][index2Array1] == array2[index1Array2][index2Array2]) {

            System.out.print("YES, " + array1[index1Array1][index2Array1] + " EQUAL " +
                    array2[index1Array2][index2Array2]);
        } else {
            System.out.print("NO, " + array1[index1Array1][index2Array1] + " IS NOT EQUAL " +
                    array2[index1Array2][index2Array2]);
        }
    }
}