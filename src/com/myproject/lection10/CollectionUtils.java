package com.myproject.lection10;

import java.util.Collection;
import java.util.Random;

public class CollectionUtils {


    /**
     * This method uses more then one time so I decided to write separate utilite method.
     * It fills with random generating numbers any 'Collection <Integer>  collections
     *
     * @param min        Min int number for generating
     * @param max        Max int number for generating
     * @param iterations number of iterations
     * @param collection collection which fill with generating numbers
     * @return collection with random generating numbers
     */
    public static Collection<Integer> randomInt(int min, int max, int iterations, Collection<Integer> collection) {

        Random rnd = new Random();
        for (int i = 0; i < iterations; i++) {
            int number = rnd.nextInt(max - min) + min;
            collection.add(number);
        }
        return collection;
    }
}

