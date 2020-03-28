package com.myproject.lection11;

import java.util.*;

public class GenerateIntegerRandom {


    /**
     * This method uses more then one time so I decided to write separate utilite method.
     * It fills with random generating numbers any 'Collection <Integer>  collections
     *
     * @param min        Min int number for generating
     * @param max        Max int number for generating
     * @param iterations number of iterations
     * @return collection with random generating numbers
     */
    public static Collection<Integer> randomInt(int min, int max, int iterations) {

        Set<Integer> randomIntSet = new HashSet<>();

        Random rnd = new Random();
        for (int i = 0; i < iterations; i++) {
            int number = rnd.nextInt(max - min) + min;
            randomIntSet.add(number);
        }
        return randomIntSet;
    }
}

