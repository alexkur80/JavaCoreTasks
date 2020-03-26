package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.util.*;

public class HashMapWordFrequency {

    /**
     * This method read text and create frequency word vocabulary output
     * Ex:  to:2    the:1   in:3
     * Algorithm description:
     * #1 Using RegEx and 'split' utilMethod create array of words from text, excluding
     * anything but a-zA-Zа-яА-ЯёЁ
     * #2 Using foreach cycle add all words in
     *
     * @param text any String text
     * @return Map<Key, Value> Key - word in 'text', Value how many word repeats in 'text'
     */
    public static Map<String, Integer> wordFrequencyVocabulary(String text) {

        String[] words = text.split("[^a-zA-Zа-яА-ЯёЁ]+");
        List<String> listWords = new ArrayList<>();

        // Putting words in ArrayList

        int i = 0;
        for (String word : words) {
            ApplicationLogger.LOGGER.info("#" + i++ + word);

        }


        Map<String, Integer> wordCounterMap = new HashMap<>();
        Integer counter = 0;
        for (String word : words) {
            if (wordCounterMap.containsKey(word)) {
                counter = wordCounterMap.get(word);
                counter++;
                wordCounterMap.put(word, counter);
            } else {
                wordCounterMap.put(word, 1);
            }

        }

        ApplicationLogger.LOGGER.info("Output unique Key:Value");

        Iterator<Map.Entry<String, Integer>> entries = wordCounterMap.entrySet()
                .iterator();

        int counterTmp02 = 0;
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            ApplicationLogger.LOGGER.info("#" + counterTmp02++ + " " + entry.getKey() + ":" + entry.getValue());
        }

        return wordCounterMap;

    }

}




