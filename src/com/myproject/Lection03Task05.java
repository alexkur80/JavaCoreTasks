package com.myproject;

import java.util.Random;
import java.util.Scanner;

import static com.myproject.Utils.checkScannerIntNumber;

public class Lection03Task05 {

    public static void main(String[] args) {
        int countStringsElementsArray1 = 3;
        int countRowsElementsArray1 = 3;

        int countStringsElementsArray2 = 4;
        int countRowsElementsArray2 = 4;

        int indexFirstArrayToCompare = 0;
        int indexSecondArrayToCompare = 0;

        int lowRandomElement = 10;
        int highRandomElement = 50;

        int[][] firstArray = new int[countStringsElementsArray1][countRowsElementsArray1];
        int[][] secondArray = new int[countStringsElementsArray2][countRowsElementsArray2];

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("First Array: ");

        // Filling random firstArrayToCompare
        for (int i = 0; i < countStringsElementsArray1; i++) {
            for (int j = 0; j < countRowsElementsArray1; j++) {
                firstArray[i][j] = rnd.nextInt(highRandomElement);
                secondArray[i][j] = rnd.nextInt(highRandomElement);
                System.out.print(firstArray[i][j] + "\t");

            }
            System.out.print("\n");

        }

// Filling random secondArrayToCompare
        System.out.println("\nSecond Array: ");


        for (int i = 0; i < countStringsElementsArray2; i++) {
            for (int j = 0; j < countRowsElementsArray2; j++) {
                secondArray[i][j] = rnd.nextInt(highRandomElement);
                System.out.print(secondArray[i][j] + "\t");

            }
            System.out.print("\n");

        }



        System.out.println("First index: [" + (indexFirstArrayToCompare = sc.nextInt()) + "])");

        indexFirstArrayToCompare = sc.nextInt();

        System.out.println("Second index: ");
        indexSecondArrayToCompare = sc.nextInt();





        /*
    int flagEqualIs = equalArraySelectedElements(firstArray[2][2], secondArray[1][2]);

        indexSecondArrayToCompare = checkScannerIntNumber(sc, indexSecondArrayToCompare);
        System.out.println("\nElement of Array 1 with Index: " + indexSecondArrayToCompare + "is" + firstArray[1][2]);

    }


    public static boolean equalArraySelectedElements(int[][] array1, int[][] array2){
    boolean flagEqualIs = false;
        if (array1[][] == array2[][]) {
            flagEqualIs = true;
    }
        return flagEqualIs;
        }

*/
    }
}
