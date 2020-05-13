package com.myproject.lection10;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SortIntegerAscending {
    public final static Logger LOGGER = Logger.getLogger(SortIntegerAscending.class);

    /**
     * Sorts collection in ascending mode. It uses
     * CollectionUtils.randomInt generates random number Collection.
     * To use Collection.sort() algorithm  we must have ArrayList collection so we create
     * new ArrayList collection and filling it with receiving collection date.
     *
     * @return ArrayList collection Integer numbers in ascending mode
     */

    public static ArrayList<Integer> sortReverse() {
        Collection<Integer> collection = GenerateIntegerRandom.randomInt(-10, 5, 10);

        LOGGER.info("Non sorted collection:");

        ArrayList<Integer> arrayList = new ArrayList<>();

        Iterator<Integer> iteratorCollection = collection.iterator();
        while (iteratorCollection.hasNext()) {
            Integer number = iteratorCollection.next();
            arrayList.add(number);
            LOGGER.info(number);
        }

        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        Iterator<Integer> iteratorArrayList = arrayList.iterator();
        LOGGER.info("Sorted and reverse  - Ascending mode");

        while (iteratorArrayList.hasNext()) {
            LOGGER.info(iteratorArrayList.next());
        }
        return arrayList;
    }
}