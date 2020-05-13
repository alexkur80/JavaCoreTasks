package com.myproject.lection11;

import org.apache.log4j.Logger;

import java.util.Iterator;
import java.util.TreeSet;

public class BlackBox<Integer> {
    public final static Logger LOGGER = Logger.getLogger(BlackBox.class);

    private TreeSet<Integer> blackBoxTreeSet;

    BlackBox(TreeSet<Integer> blackBoxTreeSet) {
        this.blackBoxTreeSet = blackBoxTreeSet;
    }

    /**
     * Accepts indexMax and return element having indexMax from MAX element of collection
     *
     * @param indexMax index, first element have index 1
     * @return int index of element from BlackBox, indexMax form the biggest element of Collection, index stats from 1
     * @throws ArrayIndexOutOfBoundsException
     */
    public Integer maxKBlackBox(int indexMax) throws ArrayIndexOutOfBoundsException {
        LOGGER.info("BlackBox sorted numbers:");

        int counter = 0;
        Iterator<Integer> iterator = blackBoxTreeSet.iterator();
        while (iterator.hasNext()) {
        LOGGER.info(iterator.next());
            counter++;
        }

        Integer elementByIndexFromMax = (Integer) this.blackBoxTreeSet.toArray()[(blackBoxTreeSet.size()) - indexMax];
        return elementByIndexFromMax;
    }

    /**
     * Accepts indexMin and return element having indexMin from MIN element of collection
     *
     * @param indexMin - index, first element have index 1
     * @return int index of element from BlackBox, indexMin form the smallest element of Collection, index stats from 1
     *
     * @throws ArrayIndexOutOfBoundsException
     */
    public Integer minKBlackBox(int indexMin) throws ArrayIndexOutOfBoundsException {
        LOGGER.info("BlackBox numbers:");

        Integer elementByIndexFromMin = (Integer) this.blackBoxTreeSet.toArray()[indexMin - 1];
        return elementByIndexFromMin;

    }

    /**
     * Adds int elements to Collection
     *
     * @param num ads number in collection
     * @throws NullPointerException
     */
    public void addBlackBox(Integer num) throws NullPointerException {
        this.blackBoxTreeSet.add(num);
    }
}