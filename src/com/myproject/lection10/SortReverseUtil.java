package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SortReverseUtil {

    /**
     * This method sort collection in ascending mode. It uses
     * CollectionUtils.randomInt metrhod to generate random number Collection.
     * To use Collection.sort() algorithm  we must have ArrayList collection so we create
     * new ArrayList collection and filling it with receiving collection date.
     *
     * @return ArrayList collection Integer numbers in ascending mode
     */

    public static ArrayList<Integer> sortReverse() {


        Collection<Integer> collection = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        collection = CollectionUtils.randomInt(-10, 5, 10, collection);

        ApplicationLogger.LOGGER.info("Non sorted collection:");

        Iterator<Integer> iteratorCollection = collection.iterator();
        while (iteratorCollection.hasNext()) {
            Integer number = iteratorCollection.next();
            arrayList.add(number);
            ApplicationLogger.LOGGER.info(number);
        }

        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        Iterator<Integer> iteratorArrayList = arrayList.iterator();
        ApplicationLogger.LOGGER.info("Sorted and reverse  - Ascending mode");

        while (iteratorArrayList.hasNext()) {
            ApplicationLogger.LOGGER.info(iteratorArrayList.next());
        }
return arrayList;
    }


}

