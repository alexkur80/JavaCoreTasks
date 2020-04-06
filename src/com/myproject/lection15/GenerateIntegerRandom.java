package com.myproject.lection15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public static List<Integer> randomInt(int min, int max, int iterations) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < iterations; i++) {
            int number = rnd.nextInt(max - min) + min;
            list.add(number);
        }
        return list;
    }
}



