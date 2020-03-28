package com.myproject.lection11;

import com.myproject.utils.ApplicationLogger;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class BlackBox<Integer> {
    TreeSet<Integer> blackBoxTreeSet;

    BlackBox(TreeSet<Integer> blackBoxTreeSet) {
        this.blackBoxTreeSet = blackBoxTreeSet;
    }


    /**
     * This method accepts indexMax and return element having indexMax from MAX element of collection
     *
     * @param indexMax
     * @return int element from BlackBox, indexMax form the biggest element of collection
     * @throws ArrayIndexOutOfBoundsException
     */
    public Integer maxKBlackBox(int indexMax) throws ArrayIndexOutOfBoundsException {

        ApplicationLogger.LOGGER.info("BlackBox sorted numbers:");

        int counter = 0;
        Iterator<Integer> iterator = blackBoxTreeSet.iterator();
        while (iterator.hasNext()) {
            ApplicationLogger.LOGGER.info(iterator.next());
            counter++;
        }

        Integer elementByIndexFromMax = (Integer) this.blackBoxTreeSet.toArray()[(blackBoxTreeSet.size()) - indexMax];
        return elementByIndexFromMax;


    }

    /**
     * This method accepts indexMin and return element having indexMin from MIN element of collection
     *
     * @param indexMin
     * @return int element from BlackBox, indexMin form the smallest element of collection
     * @throws ArrayIndexOutOfBoundsException
     */
    public Integer minKBlackBox(int indexMin) throws ArrayIndexOutOfBoundsException {

        ApplicationLogger.LOGGER.info("BlackBox numbers:");
        Integer elementByIndexFromMin = (Integer) this.blackBoxTreeSet.toArray()[indexMin - 1];
        return elementByIndexFromMin;

    }


    /**
     * This method add int elements to collection
     *
     * @param num
     * @throws NullPointerException
     */
    public void addBlackBox(Integer num) throws NullPointerException {

        this.blackBoxTreeSet.add(num);
    }

}
