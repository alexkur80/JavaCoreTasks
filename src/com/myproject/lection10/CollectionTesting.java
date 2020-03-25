/**
 * This class performs Collection manipulation
 *
 * @author akurlovich
 * @date 03/25/2020
 */

package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionTesting {
    public static void main(String[] args) {

        UtilsCollection.studentMarks();
        UtilsCollection.student();

        List<Integer> numbersToStack = null;
        try {
            numbersToStack = InputConcoleUtil.inputNumbersFromConcole();
        } catch (IOException e) {
            ApplicationLogger.LOGGER.error("Error IOException reading line from console " +
                    "in inputNumbersFromConcole method");
            e.printStackTrace();
        }

        int stackSize = numbersToStack.size();

// Stack manipulation
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

    }

}
