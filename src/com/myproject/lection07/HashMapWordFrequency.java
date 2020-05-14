package com.myproject.lection07;

import org.apache.log4j.Logger;

import java.util.*;

public class HashMapWordFrequency {
    public final static Logger LOGGER = Logger.getLogger(HashMapWordFrequency.class);

    /**
     * Reads text and create frequency word vocabulary output
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

        int counterTmp01 = 0;
        for (String word : words) {
            LOGGER.info("#" + counterTmp01++ + " " + word);
        }

        /* Checking if word is in Hashmap <String, Integer> add counter, otherwise put counter  = 1 */

        Map<String, Integer> wordCounterMap = new HashMap<>(0);
        Integer counterWords = 0;
        for (String word : words) {
            if (wordCounterMap.containsKey(word)) {
                counterWords = wordCounterMap.get(word);
                counterWords++;
                wordCounterMap.put(word, counterWords);
            } else {
                wordCounterMap.put(word, 1);
            }
        }

        LOGGER.info("Output unique Key: Value");

        Iterator<Map.Entry<String, Integer>> entries = wordCounterMap.entrySet()
                .iterator();

        int counterWordIndex = 0;
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            LOGGER.info("#" + counterWordIndex++ + " " + entry.getKey() + ":" + entry.getValue());
        }
        return wordCounterMap;
    }
}