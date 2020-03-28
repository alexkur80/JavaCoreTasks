/**
 * This class performs Collection manipulation
 *
 * @data 03/28/2020
 * @author akurlovich
 * @version Lection11 Collections. Part II
 */

package com.myproject.lection11;

import com.myproject.utils.ApplicationLogger;

import java.util.*;

public class CollectionPart02Main {
    public static void main(String[] args) {


        // Getting Random generated TreeSet collection
        Collection<Integer> randomIntSet = GenerateIntegerRandom.randomInt(-5, 5, 20);

        // Counting unique elements in TreeSet
        int counterUnique = 0;
        counterUnique = Unique.countUnique(randomIntSet);
        ApplicationLogger.LOGGER.info("Total unique numbers:" + counterUnique);

        Map<String, String> mapNameSurname01 = new HashMap<>();
        mapNameSurname01.put("Marty", "Stepp");
        mapNameSurname01.put("Stuart", "Regges");
        mapNameSurname01.put("Jessica", "Miller");
        mapNameSurname01.put("Amanda", "Camp");

        Map<String, String> mapNameSurname02 = new HashMap<>();
        mapNameSurname02.put("Kendrick", "Perkins");
        mapNameSurname02.put("Stuart", "Reges");
        mapNameSurname02.put("Jessica", "Miller");
        mapNameSurname02.put("Bruce", "Reges");
        mapNameSurname02.put("Hal", "Perkins");

        boolean unique01 = Unique.isUnique(mapNameSurname01);
        ApplicationLogger.LOGGER.info("isUnique for mapNameSurname01: " + unique01);

        boolean unique02 = Unique.isUnique(mapNameSurname02);
        ApplicationLogger.LOGGER.info("isUnique for mapNameSurname01: " + unique02);

        Map<Integer, Integer> mapMnogochlen = new HashMap<>();
        mapMnogochlen.put(3, 3);
        mapMnogochlen.put(2, 4);
        mapMnogochlen.put(8, 4);
        mapMnogochlen.put(6, 1);
        mapMnogochlen.put(1, 2);
        mapMnogochlen.put(0, 7);

        String resultMnogochlen = Polynomial.polynomial(mapMnogochlen);
        ApplicationLogger.LOGGER.info(resultMnogochlen);

        TreeSet<Integer> tree = new TreeSet<>();
        BlackBox<Integer> blackBox = new BlackBox<>(tree);
        try {
            blackBox.addBlackBox(1);
            blackBox.addBlackBox(12);
            blackBox.addBlackBox(3);
            blackBox.addBlackBox(4);
            blackBox.addBlackBox(-5);
            blackBox.addBlackBox(26);
            blackBox.addBlackBox(16);
            blackBox.addBlackBox(63);
            blackBox.addBlackBox(-7);
        } catch (NullPointerException e) {
            ApplicationLogger.LOGGER.info("use Integer type, 'null' is out of range");
            e.printStackTrace();
        }

        // choose indexMax element from BlackBox
        int indexMax = 6;
        try {
            Integer maxKBlackBox = blackBox.maxKBlackBox(indexMax);
            ApplicationLogger.LOGGER.info("Max for index: " + indexMax + ": " + maxKBlackBox);
        } catch (ArrayIndexOutOfBoundsException e) {
            ApplicationLogger.LOGGER.error("indexMax error. Out of range, exceeds BlackBox size");
            e.printStackTrace();
        }

        // choose indexMin element from BlackBox
        int indexMin = 8;
        try {
            Integer minKBlackBox = blackBox.minKBlackBox(indexMin);
            ApplicationLogger.LOGGER.info("Min for index: " + indexMin + ": " + minKBlackBox);
        } catch (ArrayIndexOutOfBoundsException e) {
            ApplicationLogger.LOGGER.error("indexMin error. Out of range, exceeds BlackBox size");
            e.printStackTrace();
        }


    }


}

