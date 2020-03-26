/**
 * This class performs Collection manipulation
 *
 * @data 03/26/2020
 * @author akurlovich
 * @version Lection10 Collections
 */

package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.io.IOException;
import java.util.*;

public class CollectionTesting {
    public static void main(String[] args) {

        Students.studentMarks();
        Students.student();

        List<Integer> numbersToStack = null;
        try {
            numbersToStack = InputConcoleUtil.inputNumbersFromConcole();
        } catch (IOException e) {
            ApplicationLogger.LOGGER.error("Error IOException reading line from console " +
                    "in inputNumbersFromConcole method");
            e.printStackTrace();
        }

        int stackSize = numbersToStack.size();

// Initialize stack class
// push stack, pop stack
        Stack stack = new Stack(stackSize, numbersToStack);
        stack.push();
        stack.pop();

// generating Collection to use for myAddAll, myRetainAll methods
        Collection<Integer> collectionFirst = SetMethodsUtil.collectionFirst();
        Collection<Integer> collectionSecond = SetMethodsUtil.collectionSecond();

        Collection<Integer> addAllCollectionResult;
        addAllCollectionResult = SetMethodsUtil.myAddAll(collectionFirst, collectionSecond);

        Collection<Integer> retainAllCollectionResult;
        retainAllCollectionResult = SetMethodsUtil.myRetainAll(collectionFirst, collectionSecond);

        String text = "In addition to the above-mentioned studies on text " +
                "books contain instructional education; the education curriculum and " +
                "text books also contain books processes and activities " +
                "aimed at raising awareness to of the boys and the education on education " +
                "of right to education also.";

        Map<String, Integer> wordCounter;
        wordCounter = MyHashMapAlgrothms.worldVocabulary(text);

        ArrayList<Integer> ascendingNumbers;
        ascendingNumbers = SortReverseUtil.sortReverse();
    }

}
