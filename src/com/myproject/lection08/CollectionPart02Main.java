package com.myproject.lection08;

import org.apache.log4j.Logger;

import java.util.*;

public class CollectionPart02Main {
    public final static Logger LOGGER = Logger.getLogger(CollectionPart02Main.class);

    public static void main(String[] args) {

        Collection<Integer> randomIntSet = GenerateIntegerRandom.randomInt(-5, 5, 20);

        /* Counts unique elements in TreeSet */

        int counterUnique = 0;
        counterUnique = Unique.countUnique(randomIntSet);
        LOGGER.info("Total unique numbers:" + counterUnique);

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

        boolean unique01;
        unique01 = Unique.isUnique(mapNameSurname01);
        LOGGER.info("isUnique for mapNameSurname01: " + unique01);

        boolean unique02;
        unique02 = Unique.isUnique(mapNameSurname02);
        LOGGER.info("isUnique for mapNameSurname01: " + unique02);

        Map<Integer, Integer> mapPolynomial = new HashMap<>();
        mapPolynomial.put(3, 3);
        mapPolynomial.put(2, 4);
        mapPolynomial.put(8, 4);
        mapPolynomial.put(6, 1);
        mapPolynomial.put(1, 2);
        mapPolynomial.put(0, 7);

        String resultPolynomial = Polynomial.polynomial(mapPolynomial);
        LOGGER.info(resultPolynomial);

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
        } catch (NullPointerException npe) {
            LOGGER.error("use Integer type, 'null' is out of range" + npe);
        }

        /* Chooses indexMax element from BlackBox */

        int indexMax = 4;
        try {
            Integer maxKBlackBox = blackBox.maxKBlackBox(indexMax);
            LOGGER.info("Max for index: " + indexMax + ": " + maxKBlackBox);
        } catch (ArrayIndexOutOfBoundsException aie) {
            LOGGER.error("indexMax error. Out of range, exceeds BlackBox size" + aie);
        }

        /* Chooses indexMin element from BlackBox */

        int indexMin = 2;
        try {
            Integer minKBlackBox = blackBox.minKBlackBox(indexMin);
            LOGGER.info("Min for index: " + indexMin + ": " + minKBlackBox);
        } catch (ArrayIndexOutOfBoundsException aie) {
            LOGGER.error("indexMin error. Out of range, exceeds BlackBox size" + aie);
        }
    }
}