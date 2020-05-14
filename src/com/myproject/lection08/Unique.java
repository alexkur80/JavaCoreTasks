package com.myproject.lection08;

import org.apache.log4j.Logger;

import java.util.*;

public final class Unique {
    public final static Logger LOGGER = Logger.getLogger(Unique.class);

    /**
     * Counts number of Unique Integer elements in collection.
     * Use TreeSet realisation to contain only unique elements and
     * counter counts numbersList of iteration in TreeMap collection.
     *
     * @param numbersList Collection
     * @return counter unique elements in Collection.
     */
    public static int countUnique(Collection<Integer> numbersList) {

        Iterator<Integer> iteratorInteger = numbersList.iterator();

        int counter = 0;
        while (iteratorInteger.hasNext()) {
            LOGGER.info(iteratorInteger.next());
            counter++;
        }
        return counter;
    }

    /**
     * Accepts Collection and return if Collection's values are unique or not
     * Algorithm:
     * counterDoubles = 0 but after fuirst comparision it will be 1. Then if it more then 1,
     * it means the same values elements appear in Collection.
     *
     * @param map Map to check for Unique values
     * @return false if Collection have not Unique values or true if  Collection's values are unique
     */
    public static boolean isUnique(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator01 = map.entrySet()
                .iterator();

        Iterator<Map.Entry<String, String>> iterator02 = map.entrySet()
                .iterator();

        /*  it will be minimum 1 if isUnique because of first comparision the same value */

        int counterDoubles = 0;

        while (iterator01.hasNext()) {
            Map.Entry<String, String> pair01 = iterator01.next();
            String value01 = pair01.getValue();

            while (iterator02.hasNext()) {
                Map.Entry<String, String> pair02 = iterator02.next();
                String value02 = pair02.getValue();

                if (value01.equals(value02)) {
                    counterDoubles++;
                }
            }
            if (counterDoubles > 1) {
                return false;
            }
        }

        return true;
    }
}