package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.util.*;

public class MyHashMapAlgrothms {

    /**
     * This method read text and create friquency word vocabulary output
     * Ex:  to:2    the:1   in:3
     * Algorithm description:
     * #1 Using RegEx and 'split' utilMethod create array of words from text, excluding
     * anything but a-zA-Zа-яА-ЯёЁ
     * #2 Using foreach cycle add all words in
     *
     * @param text any String text
     * @return Map<Key, Value> Key - word in 'text', Value how many word repeats in 'text'
     */
    public static Map<String, Integer> worldVocabulary(String text) {

        String[] words = text.split("[^a-zA-Zа-яА-ЯёЁ]+");
        List<String> listWords = new ArrayList<>();

        // Putting words in ArrayList

        int i = 0;
        for (String word : words) {
            ApplicationLogger.LOGGER.info("#" + i++ + word);

        }


        Map<String, Integer> wordCounter = new HashMap<>();
        Integer counter = 0;
        for (String word : words) {
            if (wordCounter.containsKey(word)) {
                counter = wordCounter.get(word);
                counter++;
                wordCounter.put(word, counter);
            } else {
                wordCounter.put(word, 1);
            }

        }

        ApplicationLogger.LOGGER.info("Output unique Key:Value");

        Iterator<Map.Entry<String, Integer>> entries = wordCounter.entrySet()
                .iterator();

        int counterTmp02 = 0;
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            ApplicationLogger.LOGGER.info("#" + counterTmp02++ + " " + entry.getKey() + ":" + entry.getValue());
        }

        return wordCounter;

    }

}




