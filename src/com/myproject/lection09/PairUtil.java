package com.myproject.lection09;


import java.util.List;

/**
 * This class swap two values.
 * static <K, V> Pair<K, V> swap(Pair<K, V> obj)
 * method Generics <K, V>
 * method accept (Pair<K, V> obj)
 * method return Pair<V, K>
 * Important! 'swappedPair' is another object and not 'initialPair' because swapping
 * two elements different types 'V' and 'K' is ClassCastException.
 *
 *
 */
public class PairUtil {

    static <K, V> Pair<K, V> swap(Pair<K, V> initialPair) {

        Pair swappedPair = new Pair(initialPair.getPairValue(), initialPair.getPairKey());

        return swappedPair;
    }
}