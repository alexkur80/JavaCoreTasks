package com.myproject.lection07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public final class GenerateIntegerRandom {

    /**
     * Generates numbers any Collection <Integer>
     *
     * @param min              Min int number for generating
     * @param max              Max int number for generating
     * @param numberOfIntegers number of numberOfIntegers
     * @return collection with random generating numbers from 'min' to 'max'
     */
    public static Collection<Integer> randomInt(int min, int max, int numberOfIntegers) {
        Collection<Integer> collection = new ArrayList<>();

        Random rnd = new Random();
        for (int i = 0; i < numberOfIntegers; i++) {
            int number = rnd.nextInt(max - min) + min;
            collection.add(number);
        }
        return collection;
    }
}