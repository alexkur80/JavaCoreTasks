package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.util.*;

public class CollectionsUtils {


    /**
     * This method generate Collection <Integer> with random numbers
     *
     * @return Collection <Integer> setOne
     */
    public static Collection<Integer> collectionFirst() {

        // Random filled first collection
        Collection<Integer> setOne = new TreeSet<>();
        setOne = GenerateIntegerRandom.randomInt(15, 25, 10, setOne);


        Iterator<Integer> iteratorSetOne = setOne.iterator();

        ApplicationLogger.LOGGER.info("TreeSet First:");
        while (iteratorSetOne.hasNext()) {
            ApplicationLogger.LOGGER.info(iteratorSetOne.next());

        }

        return setOne;

    }


    /**
     * This method generate Collection <Integer> with random numbers
     *
     * @return Collection <Integer> setOne
     */
    public static Collection<Integer> collectionSecond() {

        // Random filled second collection
        Collection<Integer> setSecond = new TreeSet<>();
        setSecond = GenerateIntegerRandom.randomInt(14, 30, 10, setSecond);

        Iterator<Integer> iteratorSetSecond = setSecond.iterator();

        ApplicationLogger.LOGGER.info("TreeSet Second:");
        while (iteratorSetSecond.hasNext()) {
            ApplicationLogger.LOGGER.info(iteratorSetSecond.next());

        }

        return setSecond;
    }


    /**
     * This method adding collections.  Use utilite java 'addAll' method
     *
     * @return resulting Collection
     */
    public static Collection<Integer> myAddAll(Collection<Integer> setOne, Collection<Integer> setSecond) {

        Collection<Integer> setAddAll = new TreeSet<>(setOne);
        setAddAll.addAll(setSecond);
        Iterator<Integer> iteratorAddAll = setAddAll.iterator();

        ApplicationLogger.LOGGER.info("Adding TreeSet:");
        while (iteratorAddAll.hasNext()) {
            ApplicationLogger.LOGGER.info(iteratorAddAll.next());

        }
        return setAddAll;
    }


    /**
     * This method Retaining collections. Use Utilite java 'retainAll' method
     *
     * @return resulting Collection
     */
    public static Collection<Integer> myRetainAll(Collection<Integer> setOne, Collection<Integer> setSecond) {

        Collection<Integer> setRetainAll = new TreeSet<>(setOne);
        setRetainAll.retainAll(setSecond);
        Iterator<Integer> iteratorRetainAll = setRetainAll.iterator();

        ApplicationLogger.LOGGER.info("Retaining TreeSet:");
        while (iteratorRetainAll.hasNext()) {
            ApplicationLogger.LOGGER.info(iteratorRetainAll.next());

        }
        return setRetainAll;
    }
}
