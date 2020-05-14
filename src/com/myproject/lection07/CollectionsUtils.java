package com.myproject.lection07;

import org.apache.log4j.Logger;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public final class CollectionsUtils {
    public final static Logger LOGGER = Logger.getLogger(CollectionsUtils.class);

    /**
     * Generates Collection <Integer> with random numbers
     *
     * @return Collection <Integer>
     */
    public static Collection<Integer> getRandomCollectionInteger(int min, int max, int numberOfIntegers) {

        /* Fills collection with random Integer */

        Collection<Integer> collectionRandom = GenerateIntegerRandom.randomInt(min, max, numberOfIntegers);

        LOGGER.info("Collection numbers:");

        Iterator<Integer> iteratorSetOne = collectionRandom.iterator();
        while (iteratorSetOne.hasNext()) {
            LOGGER.info(iteratorSetOne.next());
        }
        return collectionRandom;
    }

    /**
     * Adds collections.  Use utility java 'addAll' method
     *
     * @return Collection<Integer>
     */
    public static Collection<Integer> myAddAll(Collection<Integer> setOne, Collection<Integer> setSecond) {
        Collection<Integer> setAddAll = new TreeSet<>(setOne);
        setAddAll.addAll(setSecond);
        return setAddAll;
    }

    /**
     * Retains collections. Use utility java 'retainAll' method
     *
     * @return Collection <Integer>
     */
    public static Collection<Integer> myRetainAll(Collection<Integer> setOne, Collection<Integer> setSecond) {
        Collection<Integer> setRetainAll = new TreeSet<>(setOne);
        setRetainAll.retainAll(setSecond);

        return setRetainAll;
    }
}