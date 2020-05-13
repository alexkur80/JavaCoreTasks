package com.myproject.lection11;

import java.util.*;

public final class GenerateIntegerRandom {

    /**
     * Fills with random generating numbers any 'Collection <Integer>  collections
     *
     * @param min        Min int number for generating
     * @param max        Max int number for generating
     * @param numberOfIntegers number of numberOfIntegers
     * @return Collection<Integer> with random generating numbers
     */
    public static Collection<Integer> randomInt(int min, int max, int numberOfIntegers) {
        Set<Integer> randomIntegerSet = new HashSet<>();

        Random rnd = new Random();
        for (int i = 0; i < numberOfIntegers; i++) {
            int number = rnd.nextInt(max - min) + min;
            randomIntegerSet.add(number);
        }
        return randomIntegerSet;
    }
}