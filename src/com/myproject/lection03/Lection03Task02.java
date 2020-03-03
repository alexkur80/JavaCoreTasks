/**
 *  This class output first 100 elements of natural numbers, that divide for 13 OR 17 with no leavings:
 *  X % 13 == 0 OR X % 17 ==0
 *
 * @author  Kurlovich Alexander
 * @param  int countElementsToOutput  - have number of elements to output.
 *
 * @param  int counterFillingElements - verify how many elements suit for rule. in Last iteration
 *             counterFillingElements == countElementsToOutput
 * @return  first natural numbers  that divide for 13 and 17. Amount of elements for output we put in
 *          int countElementsToOutput
 *
 */

package com.myproject.lection03;

public class Lection03Task02 {

    public static void main(String[] args) {
        int countElementsToOutput = 100;
        int natulalElemenArrayDevideOn13And17[] = new int[countElementsToOutput];

        System.out.println("Congratulation! There are list of elements suit for rule: \n" +
                "1. We have " + countElementsToOutput + " numbers \n" +
                "2. Every element is natural and N % 13 ==0  AND  N % 17 ==0 \n");

        int counterFillingElements = 0;
        for (int i = 0; ; i++) {
            if (((counterFillingElements < countElementsToOutput) && ((i % 13 == 0) || (i % 17) == 0)) && i > 0) {
                natulalElemenArrayDevideOn13And17[counterFillingElements] = i;

                System.out.println(natulalElemenArrayDevideOn13And17[counterFillingElements]);
                counterFillingElements++;

            } else if (counterFillingElements == countElementsToOutput) {
                break;
            }
        }
    }

}

