package com.myproject.lection06;

public class PairUtil {

    /**
     * Swaps key and value
     *
     * @param initialPair - Pair object key, value
     * @param <K>         key
     * @param <V>         value
     * @return swapped key and value Pair<K, V> object
     */
    static <K, V> Pair<K, V> swap(Pair<K, V> initialPair) {
        return new Pair(initialPair.getPairValue(), initialPair.getPairKey());
    }
}