package com.myproject.lection10;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CollectionPart01Main {
    public final static Logger LOGGER = Logger.getLogger(CollectionPart01Main.class);

    public static void main(String[] args) {
        Students.studentMarks();
        Students.studentList();

        List<Integer> numbersToStack = new ArrayList<>();

        try {
            numbersToStack = IntegerConsoleRegular.inputNumbersFromConsole();
        } catch (IOException ioe) {
            LOGGER.error("Error IOException reading line from console " +
                    "in inputNumbersFromConsole method" + ioe);
            ioe.printStackTrace();
        }

        int stackSize = numbersToStack.size();

        /* Initializes stack class, push stack, pop stack */

        Stack stack = new Stack(stackSize, numbersToStack);
        stack.push();
        stack.pop();

        /* Generates Collection to use for myAddAll, myRetainAll methods */

        Collection<Integer> collectionFirst = CollectionsUtils.getRandomCollectionInteger(15, 25, 10);
        Collection<Integer> collectionSecond = CollectionsUtils.getRandomCollectionInteger(15, 30, 10);

        Collection<Integer> addAllCollectionResult = CollectionsUtils.myAddAll(collectionFirst, collectionSecond);
        LOGGER.info("Result after union collections:");
        for (Integer result : addAllCollectionResult) {
            LOGGER.info(result);
        }

        Collection<Integer> retainAllCollectionResult = CollectionsUtils.myRetainAll(collectionFirst, collectionSecond);
        LOGGER.info("Result after retaining collections:");
        for (Integer result : retainAllCollectionResult) {
            LOGGER.info(result);
        }

        String text = "In addition to the above-mentioned studies on text " +
                "books contain instructional education; the education curriculum and " +
                "text books also contain books processes and activities " +
                "aimed at raising awareness to of the boys and the education on education " +
                "of right to education also.";

        Map<String, Integer> wordCounter = HashMapWordFrequency.wordFrequencyVocabulary(text);
        ArrayList<Integer> ascendingNumbers = SortIntegerAscending.sortReverse();
    }
}