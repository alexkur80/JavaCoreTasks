package com.myproject.lection06;

import org.apache.log4j.Logger;

public class Pair<K, V> {
    public final static Logger LOGGER = Logger.getLogger(Pair.class);

    private K pairKey;
    private V pairValue;

    Pair() {
    }

    Pair(K pairKey, V pairValue) {
        this.pairKey = pairKey;
        this.pairValue = pairValue;
    }

    public K getPairKey() {
        return pairKey;
    }

    public void setPairKey(K pairKey) {
        this.pairKey = pairKey;
    }

    public V getPairValue() {
        return pairValue;
    }

    public void setPairValue(V pairValue) {
        this.pairValue = pairValue;
    }

    @Transaction
    public static void transactionTesting() {
        LOGGER.info("Transaction processing, please wait");
    }
}