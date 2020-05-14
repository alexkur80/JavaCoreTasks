package com.myproject.lection15;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class GenerateIntegerRandom3 {

    /**
     * Generates random numbers any 'List <Integer>
     *
     * @param min        Min int number for generating
     * @param max        Max int number for generating
     * @param iterations number of iterations
     * @return Collection with random generating numbers
     */

    public static List<Integer> randomInt(int min, int max, int iterations) {
        List<Integer> intNumbers = new LinkedList<>();

        Random rnd = new Random();
        for (int i = 0; i < iterations; i++) {
            int number = rnd.nextInt(max - min) + min;
            intNumbers.add(number);
        }
        return intNumbers;
    }
}